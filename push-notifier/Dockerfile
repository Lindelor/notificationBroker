FROM eclipse-temurin:21
LABEL authors="Lind"
WORKDIR opt/app
COPY build/libs/*.jar push-notifier.jar

ENTRYPOINT ["java", "-jar", "push-notifier.jar"]