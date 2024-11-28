package com.iit.Tutorial.OOP;

import java.sql.DriverManager;

public class Director
{
    private String name;
    private String surname;
    private int numberofMovies;
    private Date dob;

    public Director (String name, String surname, int numberofMovies)
    {
        this.name = name;
        this.surname = surname;
        this.numberofMovies = numberofMovies;
    }
    public String getName()
    {
        return name;
    }
    public String getSurname()
    {
        return surname;
    }
    public int getNumberofMovies()
    {
        return numberofMovies;
    }
    public Date getDob()
    {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
    @Override
    public String toString()
    {
        return "Director [name = " + name + ", surname = " + surname + ", dob = " + dob.getDate() + ", movies director = " + numberofMovies + "]";
    }
}
