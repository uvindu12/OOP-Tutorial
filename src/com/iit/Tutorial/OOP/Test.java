package com.iit.Tutorial.OOP;

import static java.lang.Character.getName;

public class Test
{
    public static void main (String[] args)
    {
        Date dob = new Date(16,8,1981);

        Director director = new Director("James","Cameron");
        director.setDob(dob);
        director.setNumberOfMovie(23);

        System.out.println(director);

        Movie movie = new Movie("Avatar", "Fantasy", director);
        movie.setNumAwards(3);

        System.out.println(movie);

        System.out.println("Title : " + movie.getTitle());
        System.out.println("Category : " + movie.getCategory());
        System.out.println("Director : " + movie.getDirector().getName());
        System.out.println("Number of Awards : " + movie.getNumAwards());
    }

}
