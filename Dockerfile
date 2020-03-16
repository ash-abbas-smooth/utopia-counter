FROM openjdk:8-jdk-alpine
MAINTAINER ash abbas

ADD target/counter-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT [ "java", "-jar", "app.jar"]
EXPOSE 8081