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
public class PositionDto {

    private Integer id;
    private String fullName;
    private List<EmployeeDto> employeesDto = new ArrayList<>();
}
