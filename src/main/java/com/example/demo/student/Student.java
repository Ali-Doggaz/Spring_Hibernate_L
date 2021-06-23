package com.example.demo.student;

import com.sun.istack.NotNull;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity(name="Student")
@Table(name="student")

public class Student {
    @Id
    @SequenceGenerator(
            name="student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1 // How much the sequence increases for each new row
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "student_sequence"
    )
    @Column(name="id",
            updatable = false
            // NULLABLE=FALSE, ColumnDefinition = TEXT, unique=TRUE, etc....
            )
    private long id;

    @NotNull
    @Column(name="firstName"
    )
    private String firstName;

    @NotNull
    @Column(name="lastName"
    )
    private String lastName;

    @NotNull
    @Column(name="email"
    )
    private String email;

    public Student(long id, String firstName, String lastName, String email) {

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Student(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Student() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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
}
