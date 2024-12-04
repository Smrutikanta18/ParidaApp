FROM maven:3.8.8-eclipse-temurin-17 as build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build /app/target/ParidaEngineering-0.0.1-SNAPSHOT.jar ParidaEngineering-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "ParidaEngineering-0.0.1-SNAPSHOT.jar"]