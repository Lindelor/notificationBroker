# notificationBroker
Необходимо реализовать API для отправки уведомлений 3мя разными каналами.
* СМС
* push
* e-mail  
   Решение необходимо построить на микросервисной архитектуре на стеке Spring Cloud, используя такие компоненты как Gateway, Spring Eureka,  не нужно реализовывать никаких дополнительных интеграций с сервисами отправки (смс, push, email). в качестве срабатывания отправки достаточно просто написать в лог
1) "sms was sent"
2) "psuh was sent"
3) "email was sent"
* Приложения должны запускаться в докере

# Как запустить
В системе должен быть установлен докер.
Для корректной работы без донастройки требуются порты 8761, 8765-8768
1) Открыть консоль и перейти в директорию проекта.
2) Ввести команду docker-compose build
3) Ввести команду docker-compose up

* Коллекция для тестирования в файле Notifier.postman_collection.json