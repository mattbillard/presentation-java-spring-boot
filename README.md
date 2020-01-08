# Java Spring Boot Example

This is given as a rather typical, bare bones example of a Java Spring Boot CRUD app.

With some slight modifications, the original code is from:
https://hellokoding.com/full-stack-crud-web-app-and-restful-apis-web-services-example-with-spring-boot-jpa-hibernate-mysql-vuejs-and-docker/

Changes 
- Renamed ProductAPI.java to ProductController.java
- Moved the only HTML file to the static folder
- Renamed static to webapp, so UI changes don't require reboot
- Generated some sample data

## Set up 
- Install Docker

## Run
- Run the following
  ```
  docker-compose up
  ```
- In your browser, go to  
  http://localhost:8080
- To quit, ctrl-c

