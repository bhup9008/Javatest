package com.java.capgemin.program;

public class Student {
    int id;
    String name;
    String classTeacherName;
    int standard;
    String division;
    int age;

    public Student(int age, String classTeacherName, String division, int id, String name, int standard) {
        this.age = age;
        this.classTeacherName = classTeacherName;
        this.division = division;
        this.id = id;
        this.name = name;
        this.standard = standard;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassTeacherName() {
        return classTeacherName;
    }

    public void setClassTeacherName(String classTeacherName) {
        this.classTeacherName = classTeacherName;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public int getId() {
        return id;
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

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", classTeacherName='" + classTeacherName + '\'' +
                ", standard=" + standard +
                ", division='" + division + '\'' +
                '}';
    }
}
