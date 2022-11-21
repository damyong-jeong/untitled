package untitled.domain;

import untitled.domain.*;
import untitled.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderAccepted extends AbstractEvent {

    private Long id;

    public OrderAccepted(OrderManagement aggregate){
        super(aggregate);
    }
    public OrderAccepted(){
        super();
    }
}
