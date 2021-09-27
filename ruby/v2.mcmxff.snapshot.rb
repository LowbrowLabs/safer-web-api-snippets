require 'uri'
require 'net/http'
require 'openssl'

url = URI("https://saferwebapi.com/v2/mcmx/snapshot/:McMxFfNumber")

http = Net::HTTP.new(url.host, url.port)
http.use_ssl = true
http.verify_mode = OpenSSL::SSL::VERIFY_NONE

request = Net::HTTP::Get.new(url)
request["x-api-key"] = 'YourApiKey'

response = http.request(request)
puts response.read_body
