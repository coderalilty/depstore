package com.test.depstore.model.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentDto {

    private Integer id;

    private String fullDepartmentName;

    private List<EmployeeDto> employeesDto = new ArrayList<>();
}
