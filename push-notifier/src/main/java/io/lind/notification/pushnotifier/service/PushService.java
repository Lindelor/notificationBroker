package io.lind.notification.pushnotifier.service;

import io.lind.notification.pushnotifier.dto.NotificationSendDTO;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;

@Log
@Service
public class PushService {
    public void push(NotificationSendDTO notification) {
        log.info("push was sent");
    }
}
