package com.iit.Tutorial.OOP;

public class Movie
{
    private String title;
    private String category;
    private int numAwards;
    private Director director;

    public Movie(String title, String category, Director director)
    {
        this.title = title;
        this.category = category;
        this.director = director;
    }
    public String getTitle()
    {
        return title;
    }
    public String getCategory()
    {
        return category;
    }
    public Director getDirector()
    {
        return director;
    }
    public int getNumAwards()
    {
        return numAwards;
    }
    public void setNumAwards(int numAwards)
    {
        this.numAwards = numAwards;
    }
    @Override
    public String toString()
    {
        return "Movie [title = " + title + ", category = " + category + ", director name = " + director.getName() + ", director surname = " + director.getSurname() + ", number of awards = " + numAwards + "]";
    }
}
