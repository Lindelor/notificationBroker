package io.lind.notification.smsnotifier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SmsNotifierApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmsNotifierApplication.class, args);
    }

}
