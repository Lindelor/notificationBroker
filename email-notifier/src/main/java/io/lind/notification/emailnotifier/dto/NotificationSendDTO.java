package io.lind.notification.emailnotifier.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotificationSendDTO {
    @Email
    @NotBlank
    private String email;
    @Email
    @NotBlank
    private String from;
    @NotBlank
    private String subject;
    @NotBlank
    private String body;
}
