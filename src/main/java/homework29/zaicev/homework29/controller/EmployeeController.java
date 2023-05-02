package homework29.zaicev.homework29.controller;

import homework29.zaicev.homework29.employee.Employee;
import homework29.zaicev.homework29.service.EmployeeServiceIMPL;
import homework29.zaicev.homework29.service.EmployeeServiceInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class EmployeeController {
private final EmployeeServiceInterface employeeServiceInterface;

    public EmployeeController(EmployeeServiceInterface employeeServiceInterface) {
        this.employeeServiceInterface = employeeServiceInterface;
    }
    @GetMapping
    public String hello(){
        return "HELLO";
    }
    @GetMapping("/add")
    public Employee add(@RequestParam String firstName,
                        @RequestParam String lastName,
                        @RequestParam int department,
                        @RequestParam int salary){
        return employeeServiceInterface.addEmployee(firstName,lastName,department,salary);
    }
    @GetMapping("/remove")
    public Employee remove(@RequestParam("firstName") String firstName,
                           @RequestParam("lastName") String lastName,
                           @RequestParam("department") int department,
                           @RequestParam("salary") int salary){
        return employeeServiceInterface.removeEmployee(firstName,lastName,department,salary);
    }
    @GetMapping("/find")
    public Employee find(@RequestParam String firstName,
                         @RequestParam String lastName,
                         @RequestParam int department,
                         @RequestParam int salary){
        EmployeeServiceIMPL service;
        return employeeServiceInterface.findEmployee(firstName,lastName, department, salary);
    }
    @GetMapping("/all")
    public Collection<Employee> allPrint(){
        return  employeeServiceInterface.findAll();
    }

}




