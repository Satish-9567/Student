package com.example.temp;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class StudentRepository {
    private Student student;
    private HashMap<String,Student> sname=new HashMap<>();
    private HashMap<Integer,Student> srno=new HashMap<>();
    private HashMap<Integer,Student> sage=new HashMap<>();
    private HashMap<String,Student> semail=new HashMap<>();

    public void addName(String name) {
          sname.put(name,student);
    }
    public void addAge(int age){
        sage.put(age,student);
    }
    public void addRno(int rno){
        srno.put(rno,student);
    }
    public void addEmail(String email){
        semail.put(email,student);
    }
}
