package com.example.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.bean.Employee;
import com.example.repo.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository empRepository;

    @Override
    public Employee createEmployee(Employee employee) {
        return empRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return empRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Integer id) {
        return empRepository.findById(id).orElse(null);
    }

    @Override
    public Employee updateEmployee(Integer id, Employee employee) {
        if (empRepository.existsById(id)) {
            employee.setId(id);
            return empRepository.save(employee);
        }
        return null;
    }

    @Override
    public void deleteEmployee(Integer id) {
        empRepository.deleteById(id);
    }
}
