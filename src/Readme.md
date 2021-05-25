# Spring Boot Course and Topic 

### Set up a Spring Boot application
* Using a Spring initializr create a Spring boot project - Course management system. This has two model classes topic and course. Each course belong to a topic
### Spring MVC 
* By using the Spring MVC tier create the REST api end points and map it to business logic
* create a simple api for the topic service 
### Spring data JPA 
* Connect to embedded Apache derby db using JPA. 
* Map objects and classes to the database tables using object relational mapping including JPA annotations and have it work with the Spring data JPA framework
### App execution 
* Package and execute the Spring Boot application 
* Spring Boot Actuator: A tool which lets you create and manage matrix and observe the state of the application.
    * Actuator endpoints allow you to monitor and interact with the application.
    * Run up a basic application and look at /actuator/health and /actuator/info in Postman.
    * Enable all the actuators other than the default 