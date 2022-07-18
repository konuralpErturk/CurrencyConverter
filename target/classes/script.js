var myKeyVals = { A1984 : 1, A9873 : 5, A1674 : 2, A8724 : 1, A3574 : 3, A1165 : 5 }



var saveData = $.ajax({
      type: 'POST',
      url: "someaction.do?action=saveData",
      data: myKeyVals,
      dataType: "text",
      success: function(resultData) { alert("Save Complete") }
});
saveData.error(function() { alert("Something went wrong"); });