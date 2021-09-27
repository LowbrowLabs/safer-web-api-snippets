CURL *hnd = curl_easy_init();

curl_easy_setopt(hnd, CURLOPT_CUSTOMREQUEST, "GET");
curl_easy_setopt(hnd, CURLOPT_URL, "https://saferwebapi.com/v2/usdot/sms/:USDotNumber");

struct curl_slist *headers = NULL;
headers = curl_slist_append(headers, "x-api-key: YourApiKey");
curl_easy_setopt(hnd, CURLOPT_HTTPHEADER, headers);

CURLcode ret = curl_easy_perform(hnd);
