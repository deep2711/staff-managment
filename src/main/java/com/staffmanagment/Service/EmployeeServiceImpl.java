package com.staffmanagment.Service;

import com.staffmanagment.Entity.Employee;
import com.staffmanagment.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }


    public List<Employee> getQualifiedEmployees() {
        return getAllEmployees().stream()
                .filter(employee -> employee.getJoinYear() == 2023)
                .filter(employee -> employee.getSalary() > 30000)
                .collect(Collectors.toList());
    }

    public List<Employee> getQualifiedStaff(int joinYear, float salary) {
        List<Employee> staffDetails = employeeRepository.findByJoinYearAndSalaryGreaterThan( joinYear, salary);
        return staffDetails;
    }
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

}
