const currencyList= [];
await fetch('http://localhost:8080/currencyList', {
method: 'GET',
headers: {
      'Content-Type': 'application/json'
}
}).then(response => response.json())
.then(data => currencyList = data);

const currencyRefData= [];
await fetch('http://localhost:8080/currencyRefData', {
method: 'GET',
headers: {
      'Content-Type': 'application/json'
}
}).then(response => response.json())
.then(data => currencyRefData = data);

console.log(currencyList);
console.log(currencyRefData);