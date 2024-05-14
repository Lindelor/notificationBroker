package io.lind.notification.pushnotifier.controller;

import io.lind.notification.pushnotifier.dto.NotificationSendDTO;
import jakarta.validation.Valid;
import lombok.extern.java.Log;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Log
@RestController
@RequestMapping(path = "/api")
public class NotificationController {

    @PostMapping(path = "/v1/send")
    @ResponseStatus(HttpStatus.OK)
    public void sendNotification(@Valid @RequestBody NotificationSendDTO notification) {
        log.info("push was sent");
    }
}
