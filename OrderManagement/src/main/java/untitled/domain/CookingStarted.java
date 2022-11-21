package untitled.domain;

import untitled.domain.*;
import untitled.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CookingStarted extends AbstractEvent {

    private Long id;

    public CookingStarted(OrderManagement aggregate){
        super(aggregate);
    }
    public CookingStarted(){
        super();
    }
}
