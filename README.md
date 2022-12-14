# 🚕 TAXI-SERVICE 🚕
### Project description:
A simple web-application for taxi-service that support authentication, registration, and other CRUD operation.
## 💻 Technologies
This app use:
- ☕ Java v11;
- ServletApi;
- JDBC;
- Maven;
- JSP;
- html/css;
- JSTL;
- MySql;
- Tomcat v9.
## 🎯 Features
- registration like a driver;
- authentication like a driver;
- create/delete/remove a manufacturers, cars or drivers;
- display list of all manufacturers, cars or drivers;
- display list of all cars used by an authentication driver.
## 🪜 This project has a standard N-tier architecture, where:
- classes in dao dir are responsible for working with our db;
- classes in service are responsible for the execution of logic;
- classes in controller dir handle HTTP requests;
- AuthenticationFilter gives non-authenticated access only to /login or /drivers/ad;
- webapp dir has jsp files and web.xml file which is configuration.
## 🔗 UML-diagram of database
![UML-diagram](src/main/resources/taxi_UML.png)
## ▶️  How to run
- To get the actual parameters of the database tables, run script from the [init_db.sql](src/main/resources/init_db.sql) file in the Workbench;
- specify your current IP:Port of your MySql, USERNAME AND PASSWORD in the appropriate variables in [ConnectionUtil](src/main/java/taxi/util/ConnectionUtil.java);
- For running use Servlet Container like Apache Tomcat.
  !Note: let's install Tomcat 9.0.50. If you decide to install version 10 and above,
  you should use [a different dependency for servlets](https://mvnrepository.com/artifact/jakarta.servlet/jakarta.servlet-api/5.0.0) and [JSTL](https://mvnrepository.com/artifact/jakarta.servlet.jsp.jstl/jakarta.servlet.jsp.jstl-api/2.0.0) as well.



