package rabbitmq.rabbitmq_alura.consumer;


import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import rabbitmq.rabbitmq_alura.dto.DtoResponse;

@Component
public class RabbitSub {
    
    @RabbitListener(queues = "nome.fila")
    public void rabbitSubscriber(DtoResponse message){
        System.out.println(message);
    }
}
