package com.herrho.springtest;

import lombok.Data;

import java.util.List;

@Data
public class Department {

    private Employee head;
    private List<Employee> employees;
}
