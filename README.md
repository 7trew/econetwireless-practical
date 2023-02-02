# Econet Wireless Coding exercise

## Deployment Instructions

- clone the code from the url `https://github.com/7trew/econetwireless-practical.git`
- make sure you have java 1.8 installed on the deployment server
- compile the code using `$ mvn clean install`
- run the compiled jar using `$ java -jar econetwireless-practical-0.0.1-SNAPSHOT.jar`
- consume the API using the port number `8081`
- for the project documentation visit `http://localhost:8081/swagger-ui.html` the is swagger documentation there.

- NB: Please note that due to the configs in the application properties file, every time the project is started it drops the database and creates it again

## Curl requests

### Get all areas
- curl -X GET "http://localhost:8081/area" -H "accept: */*"

### Get all shops
- curl -X GET "http://localhost:8081/shop" -H "accept: */*"

### Add a shop
- curl -X POST "http://localhost:8081/shop" -H "accept: */*" -H "Content-Type: application/json" -d "{ \"address\": \"1 First St, Harare\", \"area_id\": 1, \"shopname\": \"ECONET FIRST STREET\"}"
- curl -X POST "http://localhost:8081/shop" -H "accept: */*" -H "Content-Type: application/json" -d "{ \"address\": \"No. 2 Old, Mutare Rd, Harare\", \"area_id\": 1, \"shopname\": \"ECONET MASASA\"}"

### Get all shops under one area
- curl -X GET "http://localhost:8081/shop/area/1" -H "accept: */*"