package untitled.domain;

import untitled.domain.*;
import untitled.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class DeliveryEnded extends AbstractEvent {

    private Long id;

    public DeliveryEnded(Delivery aggregate){
        super(aggregate);
    }
    public DeliveryEnded(){
        super();
    }
}
