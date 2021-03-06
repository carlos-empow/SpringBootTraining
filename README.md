# SpringBootTraining

* eureka-server

  Implements eureka server, complete flow of zuul with eureka registry

* edge-service

  Zuul edge service project which communicates with mongoconfig-client, added eureka service registry

* mongoconfig-client

  Config client project with mongoDB Employee data, eureka client registeres with eureka server

* mongoconfig-server

  Config server project (config client properties = https://github.com/carlos-empow/ApplicationProperties)

* resttemplate-api

  Project to communicate through Web services using Rest Template

* mogodata.json

  MongoDB mock up data used test projects

* postman_collection.json

  Postman collection requests to test projects-



# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.2.7.RELEASE/gradle-plugin/reference/html/)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.2.7.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)
