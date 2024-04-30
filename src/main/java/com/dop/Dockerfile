FROM openjdk:17-slim

WORKDIR app

COPY postgres-0.0.1-SNAPSHOT.jar /app

#SPECIFY CONTAINER PORT
EXPOSE 8051 

CMD ["java", "-jar", "/app/postgres-0.0.1-SNAPSHOT.jar"]