package ir.brandimo.user.services;

import ir.brandimo.user.entities.User;
import ir.brandimo.user.repositories.UserRepository;
import ir.brandimo.user.vo.Department;
import ir.brandimo.user.vo.ResponseTemplateVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User department) {
        log.info("Inside saveUser method of User Service");
        return userRepository.save(department);
    }

    public User findUserById(Integer id) {
        log.info("Inside find User method of User Service");
        return userRepository.findUserById(id);
    }

    public ResponseTemplateVO findUserWithDepartment(Integer id) {
        ResponseTemplateVO vo = new ResponseTemplateVO();
        User  user = userRepository.findUserById(id);

        Department department =
               // restTemplate.getForObject("http://localhost:9001/deparments/"+user.getDepartmantId(),Department.class);
                restTemplate.getForObject("http://DEPARTMENT-SERVICE/deparments/"+user.getDepartmantId(),Department.class);
        vo.setUser(user);
        vo.setDepartment(department);
        return vo;
    }
}
