package com.test.depstore.model.mapper;

import com.test.depstore.model.Department;
import com.test.depstore.model.Employee;
import com.test.depstore.model.Position;
import com.test.depstore.model.dto.EmployeeDto;

public class EmployeeDtoMapper {

    private final DepartmentDtoMapper departmentDtoMapper = new DepartmentDtoMapper();
    private final PositionDtoMapper positionDtoMapper = new PositionDtoMapper();
    public  EmployeeDto entityToDto(Employee employee){
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setId(employee.getId());
        employeeDto.setFirstName(employee.getFirstName());
        employeeDto.setLastName(employee.getLastName());
        employeeDto.setDepartment(departmentDtoMapper.entityToDto(employee.getDepartment()));
        employeeDto.setPosition(positionDtoMapper.entityToDTo(employee.getPosition()));
        return employeeDto;
    }

    public Employee DtoToEntity(EmployeeDto employeeDto){
        Employee employee = new Employee();
        employee.setFirstName(employeeDto.getFirstName());
        employee.setLastName(employeeDto.getLastName());
        Position position = new Position();
        position.setId(employeeDto.getPosition().getId());
        employee.setPosition(position);
        Department department = new Department();
        department.setId(employeeDto.getDepartment().getId());
        return employee;
    }
}
