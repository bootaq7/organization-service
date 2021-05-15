FROM openjdk:8-jdk-alpine
ADD target/organization-service-1.1.jar organization-service.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/organization-service.jar"]