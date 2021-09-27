var axios = require("axios").default;

var options = {
  method: 'GET',
  url: 'https://saferwebapi.com/v3/history/census/:USDotNumber',
  headers: {'x-api-key': 'YourApiKey'}
};

axios.request(options).then(function (response) {
  console.log(response.data);
}).catch(function (error) {
  console.error(error);
});
