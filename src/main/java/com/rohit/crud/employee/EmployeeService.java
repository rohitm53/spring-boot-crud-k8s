package com.rohit.crud.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public Employee save(Employee employee){
        return repository.save(employee);
    }

    public List<Employee> getAllEmployee(){
        return repository.findAll();
    }

    public Employee getEmployeeById(String id) {
        return repository.findById(Long.valueOf(id))
                .orElseGet(()-> Employee.builder().id(1L)
                .firstName("Rohit")
                .lastName("Manohar")
                .age(30)
                .build());
    }

}
