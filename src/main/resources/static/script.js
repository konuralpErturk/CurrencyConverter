import {currencyList, currencyRefData} from './call.js';

currencyRefData.forEach(item=>
    {
        createListElement("currencyList1",item,"currencyRefData");
        createListElement("currencyList2",item,"currencyRefData");
    })

function createListElement(id,item,listType)
{
    var parentElement = document.getElementById(id);
    var li            = document.createElement("li");
    var a             = document.createElement("a");
    a.classList.add("dropdown-item");

    if(listType=="currencyRefData")
        a.innerText =item.CurrencyCode+"-"+item.CurrencyName;
    li.append(a)
    parentElement.append(li);
}

document.getElementById("currencyList1").addEventListener("click",function(e){
    if(e.target && e.target.classList.contains("dropdown-item"))
        var splitData    = e.target.innerText.split("-");
        var currencyCode = splitData[0];
        var currencyRate  = currencyList.filter(item=>item.CurrencyCode==currencyCode).map(item=>item.BanknoteBuying)[0];
        document.getElementById("currencyInput1").value = currencyRate;

})

document.getElementById("currencyList2").addEventListener("click",function(e){
    if(e.target && e.target.classList.contains("dropdown-item"))
        var splitData = e.target.innerText.split("-");
        var currencyCode = splitData[0];
        var currencyRate  = currencyList.filter(item=>item.CurrencyCode==currencyCode).map(item=>item.BanknoteBuying)[0];
        document.getElementById("currencyInput2").value = currencyRate;
})