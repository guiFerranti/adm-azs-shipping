# Dockerfile
FROM maven:3.8.4-openjdk-17-slim AS build
WORKDIR /app
COPY . /app
RUN mvn -f /app/pom.xml clean package

FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build /app/target/*.jar /app/spring-boot-application.jar
ENTRYPOINT ["java","-jar","/app/spring-boot-application.jar"]
