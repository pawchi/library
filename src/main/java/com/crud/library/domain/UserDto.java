package com.crud.library.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private Long id;
    private String firstName;
    private String surname;
    private int createAccountDate;
/*
    public UserDto() {
    }

    public UserDto(Long id, String firstName, String surname, LocalDate createAccountDate) {
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
    }*/
}
