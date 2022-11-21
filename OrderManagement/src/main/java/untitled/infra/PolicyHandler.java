package untitled.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import untitled.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import untitled.domain.*;


@Service
@Transactional
public class PolicyHandler{
    @Autowired OrderManagementRepository orderManagementRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Paid'")
    public void wheneverPaid_SetOrder(@Payload Paid paid){

        Paid event = paid;
        System.out.println("\n\n##### listener SetOrder : " + paid + "\n\n");


        // Comments // 
		//주문을설정

        // Sample Logic //
        OrderManagement.setOrder(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderReviewed'")
    public void wheneverOrderReviewed_SetOrder(@Payload OrderReviewed orderReviewed){

        OrderReviewed event = orderReviewed;
        System.out.println("\n\n##### listener SetOrder : " + orderReviewed + "\n\n");


        // Comments // 
		//주문을설정

        // Sample Logic //
        OrderManagement.setOrder(event);
        

        

    }

}


