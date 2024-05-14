package io.lind.notification.smsnotifier.controller;

import io.lind.notification.smsnotifier.dto.NotificationSendDTO;
import io.lind.notification.smsnotifier.service.SMSService;
import jakarta.validation.Valid;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Log
@RestController
@RequestMapping(path = "/api")
public class NotificationController {

    @Autowired
    private SMSService smsService;

    @PostMapping(path = "/v1/send")
    @ResponseStatus(HttpStatus.OK)
    public void sendNotification(@Valid @RequestBody NotificationSendDTO notification) {
        smsService.sendSMS(notification);
    }
}
