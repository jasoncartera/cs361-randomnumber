# cs361-randomnumber
Randon number generator microservice for CS361 project

Steps to use:
- Install Java 17
- Clone the project
- Install Maven: https://maven.apache.org/
- Navigate to the directory of the project and build with: ./mvnw clean package
- Navigate to the directory and run: java -jar target/numgen-0.0.1-SNAPSHOT.jar
- You may also run without building: ./mvnw spring-boot:run

Generate random integers from 0 to 2,147,483,647 with this endpoint:
- http://localhost:8080/

Specify an upper and lower range with query parameters: 
- http://localhost:8080/?lower=100&upper=10000
- Use upper, lower, or both

Generate a random MD5 Hash from a random 64 character length string:

http://localhost:8080/hex


