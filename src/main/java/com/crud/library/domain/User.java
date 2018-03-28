package com.crud.library.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.text.SimpleDateFormat;

//@AllArgsConstructor
//@NoArgsConstructor
//@Getter
@Entity(name = "USERS")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @NotNull
    @Column(name = "USERID", unique = true)
    private Long id;

    @Column(name = "FIRSTNAME")
    private String firstName;

    @Column(name = "SURNAME")
    private String surname;

    @Column(name = "ACCOUNT_CREATED_ON")
    private int createAccountDate;

    public User() {
    }

    public User(Long id, String firstName, String surname, int createAccountDate) {
        this.id = id;
        this.firstName = firstName;
        this.surname = surname;
        this.createAccountDate = createAccountDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getCreateAccountDate() {
        return createAccountDate;
    }

    public void setCreateAccountDate(int createAccountDate) {
        this.createAccountDate = createAccountDate;
    }
}
