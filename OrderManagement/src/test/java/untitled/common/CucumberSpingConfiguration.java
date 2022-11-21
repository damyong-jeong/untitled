package untitled.common;


import untitled.OrderManagementApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { OrderManagementApplication.class })
public class CucumberSpingConfiguration {
    
}
