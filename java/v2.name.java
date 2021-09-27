HttpResponse<String> response = Unirest.get("https://saferwebapi.com/v2/name/:CarrierName")
  .header("x-api-key", "YourApiKey")
  .asString();
