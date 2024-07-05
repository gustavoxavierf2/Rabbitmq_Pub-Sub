package rabbitmq.rabbitmq_alura.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rabbitmq.rabbitmq_alura.dto.DtoRequest;
import rabbitmq.rabbitmq_alura.dto.DtoResponse;

@RestController
@RequestMapping("/")
public class RabbitPub {
    @Autowired
    RabbitTemplate rabbitTemplate;

    @PostMapping
    public String rabbitPublisher(@RequestBody DtoRequest request){
        // var message = new Message(request.getBytes());
        // rabbitTemplate.send("nome.fila", message);

        rabbitTemplate.convertAndSend("nome.fila", request);
        return "ok";
    }
}
