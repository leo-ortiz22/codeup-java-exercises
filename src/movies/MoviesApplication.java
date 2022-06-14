package movies;

import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {

        Movie[] moviesArr = MoviesArray.findAll();


        while (true) {
            System.out.println("\n What would you like to do?");
            System.out.println("0 - Exit");
            System.out.println("1 - View all movies");
            System.out.println("2 - View movies in the animated category");
            System.out.println("3 - View movies in the drama category");
            System.out.println("4 - View movies in the horror category");
            System.out.println("5 - View movies in the sci-fi category \n");
            System.out.println("Enter your choice: \n");

            int input = new Input().getInt();
            if (input == 0) {
                System.out.println("Good Bye!");
                break;
            } else if (input == 1) {
                for (int i = 0; i < moviesArr.length; i++) {
                    System.out.println(moviesArr[i].getName());
                }
            } else if (input == 2) {
                for (Movie movie : moviesArr) {
                    if (movie.category.equals("animated")) {
                        System.out.println(movie.name);
                    }
                }
            } else if (input == 3) {
                for (Movie movie : moviesArr) {
                    if (movie.category.equals("drama")) {
                        System.out.println(movie.name);
                    }
                }
            } else if (input == 4) {
                for (Movie movie : moviesArr) {
                    if (movie.category.equals("horror")) {
                        System.out.println(movie.name);
                    }
                }
            } else if (input == 5) {
                for (Movie movie : moviesArr) {
                    if (movie.category.equals("scifi")) {
                        System.out.println(movie.name);
                    }
                }

            }
        }
    }
}