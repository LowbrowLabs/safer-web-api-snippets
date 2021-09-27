import requests

url = "https://saferwebapi.com/v3/history/crash/:USDotNumber"

headers = {"x-api-key": "YourApiKey"}

response = requests.request("GET", url, headers=headers)

print(response.text)
