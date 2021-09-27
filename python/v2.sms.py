import requests

url = "https://saferwebapi.com/v2/usdot/sms/:USDotNumber"

headers = {"x-api-key": "YourApiKey"}

response = requests.request("GET", url, headers=headers)

print(response.text)
