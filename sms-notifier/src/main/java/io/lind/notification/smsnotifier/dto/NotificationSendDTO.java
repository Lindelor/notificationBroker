package io.lind.notification.smsnotifier.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotificationSendDTO {
    @NotBlank
    @Pattern(regexp = "\\+[0-9]{11,}")
    private String phone;
    @NotBlank
    private String body;
}
