package untitled.domain;

import untitled.domain.OrderAccepted;
import untitled.domain.OrderRejected;
import untitled.domain.CookingStarted;
import untitled.domain.CookingEnded;
import untitled.OrderManagementApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="OrderManagement_table")
@Data

public class OrderManagement  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String orderId;
    
    
    
    
    
    private String state;
    
    
    
    
    
    private String review;

    @PostPersist
    public void onPostPersist(){


        OrderAccepted orderAccepted = new OrderAccepted(this);
        orderAccepted.publishAfterCommit();



        OrderRejected orderRejected = new OrderRejected(this);
        orderRejected.publishAfterCommit();



        CookingStarted cookingStarted = new CookingStarted(this);
        cookingStarted.publishAfterCommit();



        CookingEnded cookingEnded = new CookingEnded(this);
        cookingEnded.publishAfterCommit();

    }

    public static OrderManagementRepository repository(){
        OrderManagementRepository orderManagementRepository = OrderManagementApplication.applicationContext.getBean(OrderManagementRepository.class);
        return orderManagementRepository;
    }




    public static void setOrder(Paid paid){

        /** Example 1:  new item 
        OrderManagement orderManagement = new OrderManagement();
        repository().save(orderManagement);

        */

        /** Example 2:  finding and process
        
        repository().findById(paid.get???()).ifPresent(orderManagement->{
            
            orderManagement // do something
            repository().save(orderManagement);


         });
        */

        
    }
    public static void setOrder(OrderReviewed orderReviewed){

        /** Example 1:  new item 
        OrderManagement orderManagement = new OrderManagement();
        repository().save(orderManagement);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderReviewed.get???()).ifPresent(orderManagement->{
            
            orderManagement // do something
            repository().save(orderManagement);


         });
        */

        
    }


}
