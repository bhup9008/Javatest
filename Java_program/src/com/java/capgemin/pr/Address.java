package com.java.capgemin.pr;

public class Address {
    private int id;
    private String state;
    private String building_NO;
    private String country;
    private int pinCode;

    public Address(){}
    public Address(int id, String state, String building_NO, String country, int pinCode) {
        this.id = id;
        this.state = state;
        this.building_NO = building_NO;
        this.country = country;
        this.pinCode = pinCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getBuilding_NO() {
        return building_NO;
    }

    public void setBuilding_NO(String building_NO) {
        this.building_NO = building_NO;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", state='" + state + '\'' +
                ", building_NO='" + building_NO + '\'' +
                ", country='" + country + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }
}
