var axios = require("axios").default;

var options = {
  method: 'GET',
  url: 'https://saferwebapi.com/v2/name/:CarrierName',
  headers: {'x-api-key': 'YourApiKey'}
};

axios.request(options).then(function (response) {
  console.log(response.data);
}).catch(function (error) {
  console.error(error);
});
