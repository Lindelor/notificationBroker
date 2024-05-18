package io.lind.notification.emailnotifier.service;

import io.lind.notification.emailnotifier.dto.NotificationSendDTO;


public interface EmailService {
    void sendEmail(NotificationSendDTO notification);
}
