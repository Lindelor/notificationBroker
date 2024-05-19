package io.lind.notification.emailnotifier.controller;

import io.lind.notification.emailnotifier.dto.NotificationSendDTO;
import io.lind.notification.emailnotifier.service.EmailService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class NotificationController {

    private final EmailService emailService;

    @Autowired
    public NotificationController(EmailService emailService) {
        this.emailService = emailService;
    }


    @PostMapping(path = "/v1/send")
    @ResponseStatus(HttpStatus.OK)
    public void sendNotification(@Valid @RequestBody NotificationSendDTO notification) {
        emailService.sendEmail(notification);
    }
}
