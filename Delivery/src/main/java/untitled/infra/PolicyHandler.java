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
    @Autowired DeliveryRepository deliveryRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='CookingEnded'")
    public void wheneverCookingEnded_SetDelivery(@Payload CookingEnded cookingEnded){

        CookingEnded event = cookingEnded;
        System.out.println("\n\n##### listener SetDelivery : " + cookingEnded + "\n\n");


        // Comments // 
		//배달정보

        // Sample Logic //
        Delivery.setDelivery(event);
        

        

    }

}


