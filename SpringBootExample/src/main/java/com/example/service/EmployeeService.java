package com.example.service;
import com.example.service.EmployeeService;


import java.util.List;
import com.example.bean.Employee;

public interface EmployeeService {
    public List<Employee> getAllEmployee();
    public Employee getEmployeeById(Integer id);
    public Employee createEmployee(Employee employee);
    public Employee updateEmployee(Integer id, Employee employee);
    void deleteEmployee(Integer id);
}
