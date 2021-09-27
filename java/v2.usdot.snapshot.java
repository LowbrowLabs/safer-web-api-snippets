HttpResponse<String> response = Unirest.get("https://saferwebapi.com/v2/usdot/snapshot/:USDotNumber")
  .header("x-api-key", "YourApiKey")
  .asString();
