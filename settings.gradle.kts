rootProject.name = "notification-broker"

includeBuild("eureka-server")
includeBuild("sms-notifier")
includeBuild("email-notifier")
includeBuild("push-notifier")