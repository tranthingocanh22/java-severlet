package com.example.basejavaee.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    public int id;
    public String full_name;
    public String birthday;
    public String address;
    public String position;
    public String department;
}
