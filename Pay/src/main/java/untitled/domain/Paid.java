package untitled.domain;

import untitled.domain.*;
import untitled.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Paid extends AbstractEvent {

    private Long id;

    public Paid(Pay aggregate){
        super(aggregate);
    }
    public Paid(){
        super();
    }
}
