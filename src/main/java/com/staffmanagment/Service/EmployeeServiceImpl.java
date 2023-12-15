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

    /*public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }*/

    public List<Employee> getQualifiedEmployees() {
        return getAllEmployees().stream()
                .filter(employee -> employee.getJoinYear() == 2023)
                .filter(employee -> employee.getSalary() > 30000)
             //  .filter(employee -> employee.getProjects().size() > 1)
                .collect(Collectors.toList());
    }
//Extra
    public List<Employee> getQualifiedStaff(int joinYear, float salary) {
        List<Employee> staffDetails = employeeRepository.findByJoinYearAndSalaryGreaterThan( joinYear, salary);
        return staffDetails;
    }
//Extra
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

}
