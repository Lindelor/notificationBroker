package io.lind.notification.emailnotifier.controller;

import io.lind.notification.emailnotifier.dto.NotificationSendDTO;
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
        log.info("email was sent");
    }
}
