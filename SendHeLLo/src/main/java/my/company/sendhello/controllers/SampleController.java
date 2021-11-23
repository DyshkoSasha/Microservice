package my.company.sendhello.controllers;

import lombok.extern.java.Log;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Log
public class SampleController {
    final//todo почему этой переменной так плохо?
    AmqpTemplate template;

    public SampleController(AmqpTemplate template) {//todo ломбок
        this.template = template;
    }

    @GetMapping("/")
    @ResponseBody//todo что это????
    String queue1(){//todo что это???? ты пьяный был???
//        log.info("ОТПРАВИЛ HELLO");
        template.convertAndSend("queue1", "Hello");
        return "Hello";
    }
}
