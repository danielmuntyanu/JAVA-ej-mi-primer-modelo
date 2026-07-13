package com.factoriaf5;

/**
 * IPerson
 */
public interface IPerson {
    int calculateAge();
    int getAge();

    String getName();
    void setName(String name);

    String getSurname();
    void setSurname(String surname);

    String getFullName();

    int getIdNumber();
    void setIdNumber(int id_number);

    int getYearOfBirth();
    void setYearOfBirth(int year_of_birth);

}
