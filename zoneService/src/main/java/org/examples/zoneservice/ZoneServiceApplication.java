package org.examples.zoneservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ZoneServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(ZoneServiceApplication.class, args);
    }

}
