package my.company.sendhello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaClient
public class SendHelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(SendHelloApplication.class, args);
    }

}

