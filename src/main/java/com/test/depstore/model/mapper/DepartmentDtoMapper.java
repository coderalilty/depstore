package com.test.depstore.model.mapper;

import com.test.depstore.model.Department;
import com.test.depstore.model.dto.DepartmentDto;

public class DepartmentDtoMapper {

    public DepartmentDto entityToDto(Department department){
        DepartmentDto departmentDto = new DepartmentDto();
        departmentDto.setId(department.getId());
        departmentDto.setFullDepartmentName(department.getFullDepartmentName());
        return departmentDto;
    }

}
