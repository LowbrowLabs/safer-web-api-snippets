var client = new RestClient("https://saferwebapi.com/v3/history/violation/:USDotNumber");
var request = new RestRequest(Method.GET);
request.AddHeader("x-api-key", "YourApiKey");
IRestResponse response = client.Execute(request);
