# Curl requests


## Get all areas
- curl -X GET "http://localhost:8081/area" -H "accept: */*"

## Get all shops
- curl -X GET "http://localhost:8081/shop" -H "accept: */*"

## Add a shop
- curl -X POST "http://localhost:8081/shop" -H "accept: */*" -H "Content-Type: application/json" -d "{ \"address\": \"1 First St, Harare\", \"area_id\": 1, \"shopname\": \"ECONET FIRST STREET\"}"
- curl -X POST "http://localhost:8081/shop" -H "accept: */*" -H "Content-Type: application/json" -d "{ \"address\": \"No. 2 Old, Mutare Rd, Harare\", \"area_id\": 1, \"shopname\": \"ECONET MASASA\"}"

## Get all shops under one area
- curl -X GET "http://localhost:8081/shop/area/1" -H "accept: */*"