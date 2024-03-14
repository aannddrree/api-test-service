FROM openjdk:8-jdk-alpine
RUN mkdir /app
WORKDIR "/app"
COPY target/*.jar /app/app.jar
CMD ["java", "-jar", "/app/app.jar"]