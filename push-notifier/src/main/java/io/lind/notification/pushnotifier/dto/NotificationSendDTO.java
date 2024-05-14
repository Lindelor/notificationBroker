package io.lind.notification.pushnotifier.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotificationSendDTO {

    @NotBlank
    private String receiver;

    @NotBlank
    private String payload;
}
