HttpResponse<String> response = Unirest.get("https://saferwebapi.com/v3/history/census/:USDotNumber")
  .header("x-api-key", "YourApiKey")
  .asString();
