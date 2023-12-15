package com.staffmanagment.Repository;

import com.staffmanagment.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByJoinYearAndSalaryGreaterThan(int joinYear, float salary);
}