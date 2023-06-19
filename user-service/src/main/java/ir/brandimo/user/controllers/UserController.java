package ir.brandimo.user.controllers;

import ir.brandimo.user.entities.User;
import ir.brandimo.user.services.UserService;
import ir.brandimo.user.vo.ResponseTemplateVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path ="/users")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User SaveUser(@RequestBody User department){
        log.info("Inside saveUser method of User Controller");
        return userService.saveUser(department);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO findUserById(@PathVariable("id") Integer id){
        log.info("Inside getUser method of User Controller");
        return userService.findUserWithDepartment(id);
    }

}
