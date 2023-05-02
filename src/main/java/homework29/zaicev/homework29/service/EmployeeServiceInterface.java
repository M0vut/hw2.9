package homework29.zaicev.homework29.service;

import homework29.zaicev.homework29.employee.Employee;

import java.util.Collection;


public interface EmployeeServiceInterface {
    Employee addEmployee(String lastName, String firstName, int department, int salary);
    Employee removeEmployee(String lastName, String firstName, int department, int salary);
    Employee findEmployee(String lastName, String firstName, int department, int salary);
    Collection<Employee> findAll();
}
