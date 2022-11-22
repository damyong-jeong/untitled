package untitled.infra;

import untitled.domain.*;
import untitled.config.kafka.KafkaProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class OrderListViewHandler {


    @Autowired
    private OrderListRepository orderListRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenOrderPlaced_then_CREATE_1 (@Payload OrderPlaced orderPlaced) {
        try {

            if (!orderPlaced.validate()) return;

            // view 객체 생성
            OrderList orderList = new OrderList();
            // view 객체에 이벤트의 Value 를 set 함
            orderList.setOrderId(orderPlaced.getOrderId());
            // view 레파지 토리에 save
            orderListRepository.save(orderList);

        }catch (Exception e){
            e.printStackTrace();
        }
    }



}

