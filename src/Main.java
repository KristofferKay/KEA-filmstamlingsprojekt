import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        // initiate scanner for main
        Scanner scanner = new Scanner(System.in);

        // obj for Movie Collection
        MovieCollection addMovie = new MovieCollection();

        // user input
        System.out.println("Hvad er navnet på filmen?");
        String movie = scanner.nextLine();

        System.out.println("Hvem har skrevet filmen");
        String director = scanner.nextLine();

        System.out.println("Er filmen i farver");
        boolean isInColor = scanner.nextBoolean();

        System.out.println("Hvor lang er filmen i minutter");
        int lengthInMinutes = scanner.nextInt();

        System.out.println("Hvad er genre");
        String genre = scanner.next();

        System.out.println("Hvilen år er filmen lavet");
        int yearsCreated = scanner.nextInt();

        addMovie.addToMovieCollection(movie, director, isInColor, lengthInMinutes, genre, yearsCreated);

    }
}
