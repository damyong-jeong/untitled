package untitled.common;


import untitled.MessageManagementApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { MessageManagementApplication.class })
public class CucumberSpingConfiguration {
    
}
