package com.staffmanagment.Repository;

import com.staffmanagment.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByJoinYearAndSalaryGreaterThan(int joinYear, float salary);
}