package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {


        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("The Matrix", 12, 1998, 154));
        movies.add(new Movie("The Wife", 1, 2005, 124));
        movies.add(new Movie("Hunger Games", 12, 1998, 114));
        System.out.println(movies.size());
        List<Movie> movieStream = movies.stream()
                .filter(movie -> movie.movieName.contains("The"))
                .collect(Collectors.toList());
        System.out.println(movieStream.size());


        One<Boolean> testen = (t) -> true;
        {
            System.out.println(testen.test(true));
        }
        Zero test2 = () -> true;
        {
            System.out.println(test2.test());
        }
        Two<Integer,Integer> test3 = Integer::sum; {
            System.out.println(test3.test(2,2));
        }


    }


}
