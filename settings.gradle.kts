rootProject.name = "notification-broker"

includeBuild("eureka-server")
includeBuild("api-gateway")
includeBuild("sms-notifier")
includeBuild("email-notifier")
includeBuild("push-notifier")