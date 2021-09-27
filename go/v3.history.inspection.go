package main

import (
	"fmt"
	"net/http"
	"io/ioutil"
)

func main() {

	url := "https://saferwebapi.com/v3/history/inspection/:USDotNumber"

	req, _ := http.NewRequest("GET", url, nil)

	req.Header.Add("x-api-key", "YourApiKey")

	res, _ := http.DefaultClient.Do(req)

	defer res.Body.Close()
	body, _ := ioutil.ReadAll(res.Body)

	fmt.Println(res)
	fmt.Println(string(body))

}
