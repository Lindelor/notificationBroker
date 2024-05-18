package io.lind.notification.pushnotifier.service;

import io.lind.notification.pushnotifier.dto.NotificationSendDTO;

public interface PushService {
    void push(NotificationSendDTO notification);
}
