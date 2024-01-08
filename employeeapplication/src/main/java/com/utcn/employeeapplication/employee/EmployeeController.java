package com.utcn.employeeapplication.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
@CrossOrigin(origins = "http://localhost:3000")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/create")
    public Employee create(@RequestBody Employee employee){
        return employeeService.create(employee);
    }

    @GetMapping("/getAll")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/get/{id}")
    public Employee getEmployee(@PathVariable int id) {
        return employeeService.getEmployee(id);
    }

    @PutMapping(value = "/updateName/{id}")
    public Employee updateUserName(@PathVariable int id,@RequestBody Employee employee)
    {
        return employeeService.updateEmployeeName(id,employee);
    }
    @PutMapping(value = "/updateEmail/{id}")
    public Employee updateEmployeeEmail(@PathVariable int id,@RequestBody Employee employee)
    {
        return employeeService.updateEmployeeEmail(id,employee);
    }
    @PutMapping(value = "/updateEmployeeDepartment/{id}")
    public Employee updateEmployeeDepartment(@PathVariable int id,@RequestBody Employee employee)
    {
        return employeeService.updateEmployeeDepartment(id,employee);
    }
    @PutMapping(value = "/updateEmployeeManager/{id}")
    public Employee updateEmployeeManager(@PathVariable int id,@RequestBody Employee employee)
    {
        return employeeService.updateEmployeeManager(id,employee);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEmployee(@PathVariable int id) {
        employeeService.deleteEmployee(id);
    }

    @GetMapping("/by-department/{departmentID}")
    public List<Employee> getEmployeesByDepartment(@PathVariable Integer departmentID){
        return employeeService.getEmployeesByDepartment(departmentID);
    }
}
