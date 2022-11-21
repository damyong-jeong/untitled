package untitled.domain;

import untitled.domain.*;
import untitled.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CookingEnded extends AbstractEvent {

    private Long id;

    public CookingEnded(OrderManagement aggregate){
        super(aggregate);
    }
    public CookingEnded(){
        super();
    }
}
