package p1;
import java.util.Scanner;


public class Library {
    public static void main(String[] args) {
        System.out.println("Welcome to Biblica Library");
        Scanner scan = new Scanner(System.in);
        String option = null;
        do {
            System.out.println("Enter your option:");
            System.out.println("1. List Movies");
            System.out.println("2. Exit");

            option = scan.nextLine();
            switch(option) {
                case "1" :
                    Movie[] list = Movie.createMovieList();
                    System.out.println("Movie Name\t\tDirector Name\t\tRatings");
                    System.out.println("-------------------------------------------------------------------------");
                    for(int i = 0; i < 10; i++) {
                        System.out.println(list[i].movie_name+"\t\t"+list[i].director_name+"\t\t"+list[i].rating);
                    }
                    break;
                case "2" :
                    return;
            }
        }while(!option.equals("2"));

    }
}
