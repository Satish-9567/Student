package com.example.temp;

public class Student {
    private String name;
    private int age;
    private int rno;
    private String email;
    public void Student(String name,int age,int rno,String email){
        this.name=name;
        this.rno=rno;
        this.age=age;
        this.email=email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public int getRno() {
        return rno;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
}
