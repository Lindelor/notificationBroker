package io.lind.notification.emailnotifier.service;

import io.lind.notification.emailnotifier.dto.NotificationSendDTO;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;

@Log
@Service
public class EmailServiceImpl implements EmailService{
    @Override
    public void sendEmail(NotificationSendDTO notification) {
        log.info("email was sent");
    }
}
