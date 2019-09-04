package com.test.depstore.service;

import com.test.depstore.model.Employee;
import com.test.depstore.model.dto.EmployeeDto;
import com.test.depstore.model.mapper.EmployeeDtoMapper;
import com.test.depstore.repository.DepartmentRepository;
import com.test.depstore.repository.EmployeeRepository;
import com.test.depstore.repository.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    private PositionRepository positionRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    private final EmployeeDtoMapper employeeDtoMapper = new EmployeeDtoMapper();

    public List<EmployeeDto> getEmployees(){
        return employeeRepository.findAll().stream().map(entity-> employeeDtoMapper.entityToDto(entity)).collect(Collectors.toList());
    }

    public void removeEmployee(Integer id){
        employeeRepository.deleteById(id);
    }

    public EmployeeDto getEmployeeById(int id){
        return employeeDtoMapper.entityToDto(employeeRepository.getOne(id))    ;
    }

    public void save(EmployeeDto employeeDto){
        Employee employee = (employeeDto.getId() != null) ? employeeRepository.getOne(employeeDto.getId()) : new Employee();
        employee.setLastName(employeeDto.getLastName());
        employee.setFirstName(employeeDto.getFirstName());
        if (employeeDto.getDepartment().getId() != null) {
            employee.setDepartment(departmentRepository.getOne(employeeDto.getDepartment().getId()));
        }
        if (employeeDto.getPosition().getId() != null) {
            employee.setPosition(positionRepository.getOne(employeeDto.getPosition().getId()));
        }
        employeeRepository.save(employee);
    }
}
