package com.example.temp;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private StudentRepository studentRepository;
    public void addName(String name){
        studentRepository.addName(name);
    }
    public void addAge(int age){
        studentRepository.addAge(age);
    }
    public void addRno(int rno){
        studentRepository.addRno(rno);
    }
    public void addEmail(String email){
        studentRepository.addEmail(email);
    }
}
