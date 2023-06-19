package ir.brandimo.department.services;

import ir.brandimo.department.entities.Department;
import ir.brandimo.department.repositories.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment method of Department Service");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Integer id) {
        log.info("Inside find Department method of Department Service");
        return departmentRepository.findDepartmentById(id);
    }
}
