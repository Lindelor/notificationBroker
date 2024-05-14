package io.lind.notification.pushnotifier.controller;

import io.lind.notification.pushnotifier.dto.NotificationSendDTO;
import io.lind.notification.pushnotifier.service.PushService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class NotificationController {

    @Autowired
    private PushService pushService;

    @PostMapping(path = "/v1/send")
    @ResponseStatus(HttpStatus.OK)
    public void sendNotification(@Valid @RequestBody NotificationSendDTO notification) {
        pushService.push(notification);
    }
}
