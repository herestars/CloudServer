FROM openjdk:17-jdk-alpine
LABEL authors="HanZiXin"

COPY ./SpringAI/build/libs/SpringAI-0.1-SNAPSHOT.jar /app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]