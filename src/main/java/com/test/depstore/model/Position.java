package com.test.depstore.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@Table(name = "positions")
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "full_name")
    private String fullName;

    @OneToMany(mappedBy="position",
            cascade = CascadeType.REFRESH, fetch=FetchType.EAGER
    )
    private List<Employee> employees = new ArrayList<>();
}
