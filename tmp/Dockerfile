FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY ../build/libs/movies-api-0.0.1.jar movies-api-0.0.1.jar
ENTRYPOINT ["java","-jar","/movies-api-0.0.1.jar"]