FROM openjdk:17-alpine
EXPOSE 8082
COPY target/servicemanager-0.0.1-SNAPSHOT.jar spring-basic.jar
ENTRYPOINT["java","-war","spring-basic.jar"]
