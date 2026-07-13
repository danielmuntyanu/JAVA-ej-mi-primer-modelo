package com.factoriaf5;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;;

/**
 * Unit test for class Person.
 */
public class PersonTest {
    /**
     * Getting properties
     */
    @Test
    public void shouldReturnCorrectName()
    {
        IPerson daniel = new Person(
            "Daniel",
            "Muntianu",
            12345,
            1996
        );

        assertThat( daniel.getName(), is("Daniel"));
    }

    @Test
    public void shouldReturnCorrectSurname()
    {
        IPerson daniel = new Person(
            "Daniel",
            "Muntianu",
            12345,
            1996
        );

        assertThat( daniel.getSurname(), is("Muntianu"));
    }

    @Test
    public void shouldReturnCorrectId()
    {
        IPerson daniel = new Person(
            "Daniel",
            "Muntianu",
            12345,
            1996
        );

        assertThat( daniel.getIdNumber(), is(12345));
    }

    @Test
    public void shouldReturnCorrectYearOfBirth()
    {
        IPerson daniel = new Person(
            "Daniel",
            "Muntianu",
            12345,
            1996
        );

        assertThat( daniel.getYearOfBirth(), is(1996));
    }

    @Test
    public void shouldReturnCorrectFullName()
    {
        IPerson daniel = new Person(
            "Daniel",
            "Muntianu",
            12345,
            1996
        );

        assertThat( daniel.getFullName(), is("Daniel Muntianu"));
    }


    /**
     * Calculating age 
     */

    @Test
    public void shouldReturnCorrectAge()
    {
        IPerson daniel = new Person(
            "Daniel",
            "Muntianu",
            12345,
            1996
        );

        assertThat( daniel.getAge(), is(2026-1996));
    }

    @Test
    public void shouldReturnCorrectNewAgeAfterSetNewYear()
    {
        IPerson daniel = new Person(
            "Daniel",
            "Muntianu",
            12345,
            1996
        );

        daniel.setYearOfBirth(2000);

        assertThat( daniel.getAge(), is(2026-2000));
    }

    /** 
     * Setters
    */
    @Test
    public void shouldReturnCorrectNameAfterSetNewOne()
    {
        IPerson daniel = new Person(
            "Daniel",
            "Muntianu",
            12345,
            1996
        );

        daniel.setName("Dani");

        assertThat( daniel.getName(), is("Dani"));
    }

    @Test
    public void shouldReturnCorrectSurnameAfterSetNewOne()
    {
        IPerson daniel = new Person(
            "Daniel",
            "Muntianu",
            12345,
            1996
        );

        daniel.setSurname("Muntyanu");

        assertThat( daniel.getSurname(), is("Muntyanu"));
    }

    @Test
    public void shouldReturnCorrectIdAfterSetNewOne()
    {
        IPerson daniel = new Person(
            "Daniel",
            "Muntianu",
            12345,
            1996
        );

        daniel.setIdNumber(999999);

        assertThat( daniel.getIdNumber(), is(999999));
    }

    
}
