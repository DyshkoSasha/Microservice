package my.company.receivehello.util;

import lombok.RequiredArgsConstructor;
import my.company.receivehello.model.Hello;
import my.company.receivehello.service.HelloService;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@EnableRabbit
@Component
@RequiredArgsConstructor
public class RabbitMqListener {

    private final HelloService helloService;

    @RabbitListener(queues = "queue1")
    public void processQueue1(String message) {
        helloService.saveHello(new Hello(message));
    }
}
