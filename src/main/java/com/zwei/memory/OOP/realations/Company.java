package com.zwei.memory.OOP.realations;

import java.util.List;

public class Company {
    List<Person> drivers;

    public Company() {
    }

    public void setDrivers(List<Person> drivers) {
        this.drivers = drivers;
    }

    public List<Person> getDrivers() {
        return drivers;
    }
}
