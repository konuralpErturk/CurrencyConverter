let currencyList    = [];
let currencyRefData = [];

async function postData(url) {
    const response = await fetch(url, {
      method: 'GET',
      headers: {
        'Content-Type': 'application/json'
      }
    });
    return response.json();
  }

  currencyList    = await Promise.resolve(postData('http://localhost:8080/currencyList'));
  currencyRefData = await Promise.resolve(postData('http://localhost:8080/currencyRefData'));


export { currencyRefData };
export { currencyList };
