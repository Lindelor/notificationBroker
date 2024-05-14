FROM eclipse-temurin:21
LABEL authors="Lind"
WORKDIR opt/app
COPY build/libs/*.jar api-gateway.jar

ENTRYPOINT ["java", "-jar", "api-gateway.jar"]