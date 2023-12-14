# microservices-spring-gateway-eureka
This is a combination of three projects to be run in the given order
1. Run the discovery service first. Check (http://localhost:8761) to see if works
2. Run the API gateway service next. Check (http://localhost:8761) to see if API service gets listed as a service in Eureka
3. Run the product service Check (http://localhost:8761) to see if product service gets listed as a service in Eureka.
4. Run another instance of product service
5. Open Postman and try GET request on https://localhost:8082/productservice1/products
This should redirect to product service's GET method.
 
