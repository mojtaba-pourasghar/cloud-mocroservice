package ir.brandimo.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/userServiceFallBack")
    public String userServiceFallBack(){
        return "User service is taking longer than Expected . Please try again later";
    }
    @GetMapping("/departmentServiceFallBack")
    public String departmentServiceFallBack(){
        return "Department service is taking longer than Expected . Please try again later";
    }
}
