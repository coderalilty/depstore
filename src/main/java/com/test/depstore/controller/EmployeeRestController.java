package com.test.depstore.controller;

import com.test.depstore.model.Employee;
import com.test.depstore.model.Position;
import com.test.depstore.model.dto.EmployeeDto;
import com.test.depstore.repository.DepartmentRepository;
import com.test.depstore.repository.PositionRepository;
import com.test.depstore.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class EmployeeRestController {
    @Autowired
    private EmployeeService employeeService;


    @GetMapping(value = "/list")
    public List<EmployeeDto> getEmployees() {

        return employeeService.getEmployees();
    }

    @PostMapping("/save")
    public void save(@RequestBody EmployeeDto employeeDto) {

        employeeService.save(employeeDto);
    }

    @GetMapping("/{id}")
    public EmployeeDto getEmployee(@PathVariable int id){
        return employeeService.getEmployeeById(id);
    }

    @GetMapping("/remove/{id}")
    public void removeEmployee(@PathVariable Integer id){
        employeeService.removeEmployee(id);
    }
}
