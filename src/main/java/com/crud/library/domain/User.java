package com.crud.library.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

//@AllArgsConstructor
//@NoArgsConstructor
//@Getter
//@Setter
@Entity(name = "USERS")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    //@NotNull
    @Column(name = "USERID", unique = true)
    private Long id;

    @Column(name = "FIRSTNAME")
    private String firstName;

    @Column(name = "SURNAME")
    private String surname;

    @Column(name = "ACCOUNT_CREATED_ON")
    private LocalDate createAccountDate;

    //DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-mm-dd");

    public User() {
    }

    public User(String firstName, String surname, LocalDate createAccountDate) {

        this.firstName = firstName;
        this.surname = surname;
        this.createAccountDate = createAccountDate;
    }

    public User(Long id, String firstName, String surname, LocalDate createAccountDate) {
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

    public LocalDate getCreateAccountDate() {
        return createAccountDate;
    }

    public void setCreateAccountDate(LocalDate createAccountDate) {
        this.createAccountDate = createAccountDate;
    }
}
