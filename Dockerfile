FROM openjdk:17
#ADD target/ms-employee.jar ms-employee.jar
COPY target/ms-employee.jar ms-employee.jar
ENTRYPOINT ["java","-jar","ms-employee.jar"]