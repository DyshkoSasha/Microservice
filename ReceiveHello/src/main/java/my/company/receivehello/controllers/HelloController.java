package my.company.receivehello.controllers;

import lombok.RequiredArgsConstructor;
import my.company.receivehello.service.HelloService;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableRabbit
@RequiredArgsConstructor
@RestController
public class HelloController {

    private final HelloService helloService;

    @GetMapping("/")
    public String getCount() {
        return "С Вами поздоровались " + helloService.getCount() + " раз";
    }
}
