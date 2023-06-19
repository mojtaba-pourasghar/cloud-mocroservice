package ir.brandimo.user;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class UserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }
    @Value("${welcome.message}")
    private String welcomeMessage;

    @GetMapping("/")
    public String hello(){
        return welcomeMessage;
    }

    @Bean
    @LoadBalanced // it is for call webservice from server registry address
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
