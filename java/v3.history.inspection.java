HttpResponse<String> response = Unirest.get("https://saferwebapi.com/v3/history/inspection/:USDotNumber")
  .header("x-api-key", "YourApiKey")
  .asString();
