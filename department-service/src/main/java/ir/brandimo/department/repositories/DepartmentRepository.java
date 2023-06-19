package ir.brandimo.department.repositories;

import ir.brandimo.department.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Integer> {
    Department findDepartmentById(Integer id);
}
