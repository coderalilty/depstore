package com.test.depstore.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name = "department_id", referencedColumnName="id")
    private Department department = new Department();


    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name = "position_id", referencedColumnName="id")
    private Position position = new Position();
}
