package com.java.capgemin.compare;

public class Customer implements Comparable<Customer>{

    private  int id;
    private String name;
    private String lastname;
    private Double salary;

    public Customer(int id, String lastname, String name, Double salary) {
        this.id = id;
        this.lastname = lastname;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Customer o) {
        if(this.id==o.id){
            return 0;
        }
        if(this.id>o.id){
            return 1;
        }else {
            return -1;
        }
        //return Integer.compare(this.id, o.id);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
