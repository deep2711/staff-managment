package com.staffmanagment.Controller;

import com.staffmanagment.Entity.Employee;
import com.staffmanagment.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/qualified")
    public List<Employee> getQualifiedEmployees() {
        return employeeService.getQualifiedEmployees();
    }
    @GetMapping("/getStaffBy/{joinYear}/{salary}")
    public ResponseEntity<List<Employee>> getStaffByYearAndSalary(@PathVariable int joinYear, @PathVariable float salary){
        List<Employee> staffDetails = employeeService.getQualifiedStaff(joinYear, salary);

        if (staffDetails.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return ResponseEntity.ok(staffDetails);
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }
}
