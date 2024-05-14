package io.lind.notification.smsnotifier.service;

import io.lind.notification.smsnotifier.dto.NotificationSendDTO;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;

@Log
@Service
public class SMSService {
    public void sendSMS(NotificationSendDTO notification) {
        log.info("sms was sent");
    }
}
