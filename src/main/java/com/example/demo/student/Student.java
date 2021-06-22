package com.example.demo.student;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Student {
    @Id
    @GeneratedValue
    private long id;

    @NotNull
    private String firstNname;

    @NotNull
    private String lastName;

    @NotNull
    private String email;

    @NotNull
    private int age;

    public Student(long id, String firstNname, String lastName, String email, int age) {
        this.id = id;
        this.firstNname = firstNname;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }

    public Student(String firstNname, String lastName, String email, int age) {
        this.firstNname = firstNname;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }

    public Student() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstNname() {
        return firstNname;
    }

    public void setFirstNname(String firstNname) {
        this.firstNname = firstNname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
