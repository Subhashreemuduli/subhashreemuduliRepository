package com.ivycomtech.Movie;

public class Movie {
    String title;
    String studio;
    String rating;

    public Movie(String title,String studio,String rating)
    {
        this.title=title;
        this.studio=studio;
        this.rating=rating;
    }
    public Movie(String title,String studio)
    {
        this.title=title;
        this.studio=studio;
         rating="PG";
    }
    public static Movie[] getPG(Movie[] movies ){
        Movie [] movies1=new Movie[movies.length];
        int index=0;
        for(int i=0;i< movies.length;i++)
        {
            if(movies[i].rating.equals("PG"));
            movies1[index]=movies[i];
            index++;
        }
        return movies1;
    }

}
