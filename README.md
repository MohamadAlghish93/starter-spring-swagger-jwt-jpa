# TSC

TSC back-end API java using spring boot freamwork


### **Requirement**

`1` Oracle 12c v12.2.0.1.0

`2` apache-maven v3.6.1

`3` ojdbc7.jar v12.1.0

`4` Java JDK v1.8

### **Install**

~~~~
using the command to install
    install ojdbc7.jar :
    mvn install:install-file -Dfile=ojdbc7.jar -DgroupId=com.oracle -DartifactId=ojdbc7 -Dversion=12.1.0 -Dpackaging=jar
~~~~

### **Run Project**

* mvn clean install

* mvn spring-boot:run

* java -jar target\STC-0.0.1-SNAPSHOT.jar

### **Swagger API**

URL documentation `http://localhost:{PORT}/swagger-ui.html`

### **Code Features**
The following guides illustrate how to use some features concretely

You may be interested com other spring security article :

* [JPA auditing controller](https://springbootdev.com/2018/03/13/spring-data-jpa-auditing-with-createdby-createddate-lastmodifiedby-and-lastmodifieddate/)

* [Authentication with Json Web Token (JWT)](https://medium.com/omarelgabrys-blog/microservices-with-spring-boot-authentication-with-jwt-part-3-fafc9d7187e8)

* [Spring Boot + Swagger2](https://www.javainuse.com/spring/boot_swagger)

* [Install Tomcat on Windows](https://www.baeldung.com/tomcat) || [Tomcat add admin user](https://stackoverflow.com/questions/1321933/how-do-i-set-tomcat-manager-application-user-name-and-password-for-netbeans/18072892)

* [Create WAR file in Spring Boot](https://javapointers.com/spring/spring-boot/create-war-file-in-spring-boot)

* [create user in MySQL](https://matomo.org/faq/how-to-install/faq_23484/)
