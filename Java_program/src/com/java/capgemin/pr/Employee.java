package com.java.capgemin.pr;

import java.util.List;

public class Employee {

    private int id;
    private String name;
    private int age;
    private Double salary;
    private List<Address> addressList;

    public Employee() {
    }

    public Employee(int id, String name, int age, Double salary, List<Address> addressList) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.addressList = addressList;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", listAddress=" + addressList +
                '}';
    }
}
