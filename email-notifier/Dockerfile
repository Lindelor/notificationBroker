FROM eclipse-temurin:21
LABEL authors="Lind"
WORKDIR opt/app
COPY build/libs/*.jar email-notifier.jar

ENTRYPOINT ["java", "-jar", "email-notifier.jar"]