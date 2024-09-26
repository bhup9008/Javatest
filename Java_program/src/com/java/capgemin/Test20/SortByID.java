package com.java.capgemin.Test20;

import java.util.Comparator;

public class SortByID implements Comparator<Employee> {

    public int compare(Employee a, Employee b)
    {
        return a.getId() - b.getId();
    }
}
