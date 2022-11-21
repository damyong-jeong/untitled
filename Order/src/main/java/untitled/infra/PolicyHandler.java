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
    @Autowired OrderRepository orderRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderRejected'")
    public void wheneverOrderRejected_GetOrderState(@Payload OrderRejected orderRejected){

        OrderRejected event = orderRejected;
        System.out.println("\n\n##### listener GetOrderState : " + orderRejected + "\n\n");


        // Comments // 
		//주문상태조회

        // Sample Logic //
        Order.getOrderState(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='CookingStarted'")
    public void wheneverCookingStarted_GetOrderState(@Payload CookingStarted cookingStarted){

        CookingStarted event = cookingStarted;
        System.out.println("\n\n##### listener GetOrderState : " + cookingStarted + "\n\n");


        // Comments // 
		//주문상태조회

        // Sample Logic //
        Order.getOrderState(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='CookingEnded'")
    public void wheneverCookingEnded_GetOrderState(@Payload CookingEnded cookingEnded){

        CookingEnded event = cookingEnded;
        System.out.println("\n\n##### listener GetOrderState : " + cookingEnded + "\n\n");


        // Comments // 
		//주문상태조회

        // Sample Logic //
        Order.getOrderState(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='DeliveryStarted'")
    public void wheneverDeliveryStarted_GetOrderState(@Payload DeliveryStarted deliveryStarted){

        DeliveryStarted event = deliveryStarted;
        System.out.println("\n\n##### listener GetOrderState : " + deliveryStarted + "\n\n");


        // Comments // 
		//주문상태조회

        // Sample Logic //
        Order.getOrderState(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderAccepted'")
    public void wheneverOrderAccepted_GetOrderState(@Payload OrderAccepted orderAccepted){

        OrderAccepted event = orderAccepted;
        System.out.println("\n\n##### listener GetOrderState : " + orderAccepted + "\n\n");


        // Comments // 
		//주문상태조회

        // Sample Logic //
        Order.getOrderState(event);
        

        

    }

}


