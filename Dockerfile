
FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY Scientific-Calculator-1.0-SNAPSHOT.jar app.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "app.jar"]