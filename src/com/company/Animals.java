package com.company;

public abstract class Animals {
    private String nicname;
    private String gender;
    private int age;
    private  int weight;

    public Animals(String nicname, String gender, int age, int weight) {
        this.nicname = nicname;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
    }

    public String getNicname() {
        return nicname;
    }

    public void setNicname(String nicname) {
        this.nicname = nicname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void getanimals(){
        System.out.println(":: aty::  "+getNicname()+": pol : "+getGender()+": jashi : "+getAge()+" :salmagi : "+getWeight());
    }
}


