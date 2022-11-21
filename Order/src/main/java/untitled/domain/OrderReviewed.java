package untitled.domain;

import untitled.domain.*;
import untitled.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderReviewed extends AbstractEvent {

    private Long id;

    public OrderReviewed(Order aggregate){
        super(aggregate);
    }
    public OrderReviewed(){
        super();
    }
}
