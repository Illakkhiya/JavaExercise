package p1;

public class Movie {
    public String movie_name;
    public String director_name;
    public String rating;

    public static Movie[] createMovieList() {
        Movie[] movie_list = new Movie[10];
        for(int i = 0; i < 10; i++) {
            movie_list[i] = new Movie();
        }
        movie_list[0].movie_name = "The 400 blows";
        movie_list[0].director_name = "Francois";
        movie_list[0].rating = "8.1";

        movie_list[1].movie_name = "The Godfather";
        movie_list[1].director_name = "Francois Ford";
        movie_list[1].rating = "9";

        movie_list[2].movie_name = "Man Bites Dog";
        movie_list[2].director_name = "Remy";
        movie_list[2].rating = "7.6";

        movie_list[3].movie_name = "Raw";
        movie_list[3].director_name = "Robert";
        movie_list[3].rating = "N/A";

        movie_list[4].movie_name = "Stalag 17";
        movie_list[4].director_name = "Billy";
        movie_list[4].rating = "8";

        movie_list[5].movie_name = "Batman Begins";
        movie_list[5].director_name = "Christopher";
        movie_list[5].rating = "N/A";

        movie_list[6].movie_name = "Snatch";
        movie_list[6].director_name = "Guy";
        movie_list[6].rating = "8.3";

        movie_list[7].movie_name = "Gladiator";
        movie_list[7].director_name = "Ridley";
        movie_list[7].rating = "8.5";

        movie_list[8].movie_name = "Amelie";
        movie_list[8].director_name = "Jean";
        movie_list[8].rating = "8.3";

        movie_list[9].movie_name = "Creash";
        movie_list[9].director_name = "Duck";
        movie_list[9].rating = "N/A";

        return movie_list;
    }

}
