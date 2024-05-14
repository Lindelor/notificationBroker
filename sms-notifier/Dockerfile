FROM eclipse-temurin:21
LABEL authors="Lind"
WORKDIR opt/app
COPY build/libs/*.jar sms-notifier.jar

ENTRYPOINT ["java", "-jar", "sms-notifier.jar"]