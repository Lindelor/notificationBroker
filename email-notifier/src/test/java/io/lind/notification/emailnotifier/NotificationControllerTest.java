package io.lind.notification.emailnotifier;

import io.lind.notification.emailnotifier.dto.NotificationSendDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import org.springframework.http.MediaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class NotificationControllerTest {

    @Autowired
    private ObjectMapper om;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testPositive() throws Exception {
        var dto = new NotificationSendDTO();
        dto.setSubject("Test Subject");
        dto.setBody("Test Body");
        dto.setFrom("test@test.com");
        dto.setEmail("test@test.com");

        var request = post("/api/v1/send")
                .contentType(MediaType.APPLICATION_JSON)
                .content(om.writeValueAsString(dto));

        var result = mockMvc.perform(request)
                .andExpect(status().isOk())
                .andReturn();
    }

    @Test
    public void testNegativeWithoutSubject() throws Exception {
        var dto = new NotificationSendDTO();
        dto.setBody("Test Body");
        dto.setFrom("test@test.com");
        dto.setEmail("test@test.com");

        var request = post("/api/v1/send")
                .contentType(MediaType.APPLICATION_JSON)
                .content(om.writeValueAsString(dto));

        var result = mockMvc.perform(request)
                .andExpect(status().isBadRequest())
                .andReturn();
    }

    @Test
    public void testNegativeWithoutBody() throws Exception {
        var dto = new NotificationSendDTO();
        dto.setSubject("Test Subject");
        dto.setFrom("test@test.com");
        dto.setEmail("test@test.com");

        var request = post("/api/v1/send")
                .contentType(MediaType.APPLICATION_JSON)
                .content(om.writeValueAsString(dto));

        var result = mockMvc.perform(request)
                .andExpect(status().isBadRequest())
                .andReturn();
    }

    @Test
    public void testNegativeWithoutFrom() throws Exception {
        var dto = new NotificationSendDTO();
        dto.setBody("Test Body");
        dto.setSubject("Test Subject");
        dto.setEmail("test@test.com");

        var request = post("/api/v1/send")
                .contentType(MediaType.APPLICATION_JSON)
                .content(om.writeValueAsString(dto));

        var result = mockMvc.perform(request)
                .andExpect(status().isBadRequest())
                .andReturn();
    }

    @Test
    public void testNegativeWithoutEmail() throws Exception {
        var dto = new NotificationSendDTO();
        dto.setSubject("Test Subject");
        dto.setBody("Test Body");
        dto.setFrom("test@test.com");

        var request = post("/api/v1/send")
                .contentType(MediaType.APPLICATION_JSON)
                .content(om.writeValueAsString(dto));

        var result = mockMvc.perform(request)
                .andExpect(status().isBadRequest())
                .andReturn();
    }
}
