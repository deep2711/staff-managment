package com.staffmanagment.Service;

import com.staffmanagment.Entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();

    /*public Employee getEmployeeById(Long id);*/
    public List<Employee> getQualifiedEmployees();
    public Employee saveEmployee(Employee employee);

//Extra
    public List<Employee> getQualifiedStaff(int joinYear, float staffSalary);
//Extra
}
