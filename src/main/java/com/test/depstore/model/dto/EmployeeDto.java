package com.test.depstore.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {

    private Integer id;
    private String firstName;
    private String lastName;
    private DepartmentDto department = new DepartmentDto();
    private PositionDto position = new PositionDto();
}
