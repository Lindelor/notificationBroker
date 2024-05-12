package io.lind.notification.pushnotifier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PushNotifierApplication {

    public static void main(String[] args) {
        SpringApplication.run(PushNotifierApplication.class, args);
    }

}
