HttpResponse<String> response = Unirest.get("https://saferwebapi.com/v3/history/violation/:USDotNumber")
  .header("x-api-key", "YourApiKey")
  .asString();
