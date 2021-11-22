package my.company.sendhello.controllers;

import lombok.extern.java.Log;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Log
public class SampleController {
    final
    AmqpTemplate template;

    public SampleController(AmqpTemplate template) {
        this.template = template;
    }

    @GetMapping("/")
    @ResponseBody
    String queue1(){
//        log.info("ОТПРАВИЛ HELLO");
        template.convertAndSend("queue1", "Hello");
        return "Hello";
    }
}
