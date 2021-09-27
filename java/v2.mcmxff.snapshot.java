HttpResponse<String> response = Unirest.get("https://saferwebapi.com/v2/mcmx/snapshot/:McMxFfNumber")
  .header("x-api-key", "YourApiKey")
  .asString();
