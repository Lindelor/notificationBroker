package io.lind.notification.smsnotifier.service;

import io.lind.notification.smsnotifier.dto.NotificationSendDTO;


public interface SMSService {
    void sendSMS(NotificationSendDTO notification);
}
