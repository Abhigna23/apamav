FROM eclipse-temurin:17-jre
WORKDIR /app
COPY target/apamav-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
CMD ["7"]