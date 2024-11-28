package com.iit.Tutorial.OOP;

public class Director
{
    private String name;
    private String surname;
    private int numberOfMovies;
    private Date dob;

    public Director (String name, String surname)
    {
        this.name = name;
        this.surname = surname;
        this.numberOfMovies = numberOfMovies;
    }
    public String getName()
    {
        return name;
    }
    public String getSurname()
    {
        return surname;
    }
    public void setNumberOfMovie(int num) {
        this.numberOfMovies = num;
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
        return "Director [name = " + name + ", surname = " + surname + ", dob = " + dob.getDate() + ", movies director = " + numberOfMovies + "]";
    }


}
