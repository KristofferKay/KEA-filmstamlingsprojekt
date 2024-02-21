import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        final int SENTINEL = 2;
        int loopInput = 0;

        // initiate scanner for main
        Scanner scanner = new Scanner(System.in);
        System.out.println();

        // obj for Movie Collection
        Controller controller = new Controller();

        while (loopInput != SENTINEL) {
            System.out.println("Velkommen til din filmsamling");
            System.out.println("1. Opret film");
            System.out.println("2. Afslut");
            System.out.println("3. Se din filmsamling");
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

                 controller.addMovie(movie, director, isInColor, lengthInMinutes, genre, yearsCreated);

                 System.out.println("Du har tilføjet " + movie + " til din samling");
             }

            // stops the process
            if (loopInput == 2) {
                System.out.println("Du har afsluttet processen");
                break; // breaks out of the loop
            }

            // Write movie collection to user
            if (loopInput == 3) {
                System.out.println("Din filmsamling:");
                System.out.println(" ");
                for (Movie currentMovie : controller.movieCollection.movieArray) {
                    System.out.println(" Movie title " + currentMovie.getMovie() + " Director " + currentMovie.getDirector() + " Movie Genre " + currentMovie.getGenre() + " Is the movie in color? " + currentMovie.isInColor() + " Length in min " + currentMovie.getLengthInMinutes() + " movie was released in " + currentMovie.getYearsCreated());

                }
            }
        }
    }
}