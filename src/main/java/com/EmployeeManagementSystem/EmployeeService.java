package com.EmployeeManagementSystem;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    // Save Employee
    public Employee saveEmployee(Employee employee) {
        return employeeDao.save(employee);
    }

    // Get All Employees
    public List<Employee> getAllEmployees() {
        return employeeDao.findAll();
    }

    // Get Employee By ID
    public Employee getEmployeeById(int empid) {
        return employeeDao.findById(empid).orElse(null);
    }

    // Update Employee
    public Employee updateEmployee(Employee employee) {
        return employeeDao.save(employee);
    }

    // Delete Employee
    public void deleteEmployee(int empid) {
        employeeDao.deleteById(empid);
    }
}