import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        final int SENTINEL = 2;
        int loopInput = 0;

        // initiate scanner for main
        Scanner scanner = new Scanner(System.in);

        // obj for Movie Collection
        MovieCollection addMovie = new MovieCollection();

        while (loopInput != SENTINEL) {
            System.out.println("Velkommen til din filmsamling");
            System.out.println("1. Opret film");
            System.out.println("2. Afslut");
            loopInput = scanner.nextInt();

            if (loopInput == 1 ) {

                 // user input
                 System.out.println("Hvad er navnet på filmen?");
                 String movie = scanner.next();

                 System.out.println("Hvem har skrevet filmen");
                 String director = scanner.next();

                 System.out.println("Er filmen i farver");
                 boolean isInColor = scanner.nextBoolean();

                 System.out.println("Hvor lang er filmen i minutter");
                 int lengthInMinutes = scanner.nextInt();

                 System.out.println("Hvad er genre");
                 String genre = scanner.next();

                 System.out.println("Hvilen år er filmen lavet");
                 int yearsCreated = scanner.nextInt();

                 addMovie.addToMovieCollection(movie, director, isInColor, lengthInMinutes, genre, yearsCreated);

                 System.out.println("Du har tilføjet " + movie + " til din samling");
             }
        }
        if (loopInput == SENTINEL) {
            System.out.println("Du har afsluttet processen");
        }


    }
}