FROM eclipse-temurin:21
LABEL authors="Lind"
WORKDIR opt/app
COPY build/libs/*.jar eureka-server.jar

ENTRYPOINT ["java", "-jar", "eureka-server.jar"]