package my.company.receivehello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ReceiveHelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReceiveHelloApplication.class, args);
    }

}
