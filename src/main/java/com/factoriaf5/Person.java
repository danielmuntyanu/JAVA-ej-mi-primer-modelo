package com.factoriaf5;

import java.time.Year;

/**
 * Person
 */
public class Person implements IPerson {

    private String name;
    private String surname;
    private int id_number;
    private int year_of_birth;
    private int age;

    public Person(
        String name,
        String surname,
        int id_number,
        int year_of_birth
    ) {
        this.name = name;
        this.surname = surname;
        this.id_number = id_number;
        this.year_of_birth = year_of_birth;
        this.age = calculateAge();
    }

    @Override
    public int calculateAge() {
        int year_now = Year.now().getValue();
        int age = year_now - this.year_of_birth;
        return age;
    }

    public String getFullName() {
        return this.name + " " + this.surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getIdNumber() {
        return id_number;
    }

    public void setIdNumber(int id_number) {
        this.id_number = id_number;
    }

    public int getYearOfBirth() {
        return year_of_birth;
    }

    public void setYearOfBirth(int year_of_birth) {
        this.year_of_birth = year_of_birth;
        this.age = calculateAge();
    }

    public int getAge() {
        return age;
    }

}
