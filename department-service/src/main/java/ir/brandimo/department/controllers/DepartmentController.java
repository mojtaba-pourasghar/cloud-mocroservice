package ir.brandimo.department.controllers;

import ir.brandimo.department.entities.Department;
import ir.brandimo.department.services.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path ="/deparments")
@Slf4j
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department SaveDepartment(@RequestBody Department department){
        log.info("Inside saveDepartment method of Department Controller");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Integer id){
        log.info("Inside getDepartment method of Department Controller");
        return departmentService.findDepartmentById(id);
    }

}
