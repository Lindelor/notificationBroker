package io.lind.notification.smsnotifier;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.lind.notification.smsnotifier.dto.NotificationSendDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
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
        dto.setPhone("+79999999999");
        dto.setBody("Test Body");

        var request = post("/api/v1/send")
                .contentType(MediaType.APPLICATION_JSON)
                .content(om.writeValueAsString(dto));

        var result = mockMvc.perform(request)
                .andExpect(status().isOk())
                .andReturn();
    }

    @Test
    public void testNegativeWithoutPhone() throws Exception {
        var dto = new NotificationSendDTO();
        dto.setBody("Test Body");

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
        dto.setPhone("+79999999999");

        var request = post("/api/v1/send")
                .contentType(MediaType.APPLICATION_JSON)
                .content(om.writeValueAsString(dto));

        var result = mockMvc.perform(request)
                .andExpect(status().isBadRequest())
                .andReturn();
    }
}
