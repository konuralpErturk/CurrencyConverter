async function fetchData(url) {
      try {
            const response = await fetch(url, {
                  method: 'GET',
            });
            const exam = await response.json();
            return exam;
      } catch (error) {
            console.error(error);
      }
      }

async function renderData(url) {
      const result = await fetchData(url);
      return result;
}
const result = await renderData("http://localhost:8080/currencyList");
console.log(result);
result = await renderData("http://localhost:8080/currencyRefData");
console.log(result);