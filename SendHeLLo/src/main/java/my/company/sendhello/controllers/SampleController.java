package my.company.sendhello.controllers;


import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log
@RequiredArgsConstructor
public class SampleController {
    private final AmqpTemplate template;

    @GetMapping()
    public String sendMess(){
        template.convertAndSend("queue1", "Hello");
        return "Hello";
    }
}
