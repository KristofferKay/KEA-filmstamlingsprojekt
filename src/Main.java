import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        final int SENTINEL = 2;
        int loopInput = 0;


        // initiate scanner for main
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        System.out.println();


        // obj for Movie Collection
        Controller controller = new Controller();

        while (loopInput != SENTINEL) {
            System.out.println("Velkommen til din filmsamling");
            System.out.println("1. Opret film");
            System.out.println("2. Afslut");
            System.out.println("3. Se din filmsamling");
            System.out.println("4. Søg på din filmsamling");
            loopInput = scanner.nextInt();

            if (loopInput == 1) {

                // user input
                System.out.println("Hvad er navnet på filmen?");
                String title = scanner.next();

                System.out.println("Hvem har skrevet filmen");
                String director = scanner.next();

                System.out.println("Er filmen i farver, skriv ja eller nej");
                boolean isInColor = false;
                String erIFarve = scanner.next();
                erIFarve = erIFarve.toLowerCase();
                if (erIFarve.equals("ja")) {
                    isInColor = true;
                }

                System.out.println("Hvor lang er filmen i minutter");
                int lengthInMinutes = scanner.nextInt();

                System.out.println("Hvad er genre");
                String genre = scanner.next();

                System.out.println("Hvilen år er filmen lavet");
                int yearsCreated = scanner.nextInt();

                controller.addMovieController(title, director, isInColor, lengthInMinutes, genre, yearsCreated);

                System.out.println("Du har tilføjet " + title + " til din samling");
            }

            // TILFØJ IF ELSE LOOP I STEDET
            // stops the process
            if (loopInput == 2) {
                System.out.println("Du har afsluttet processen");
                break; // breaks out of the loop
            }

            // Write movie collection to user
            if (loopInput == 3) {
                System.out.println("Din filmsamling:");

                // printout movie collection
                System.out.println(controller.returnMovieString());
            }
            // search for movie in collection based on title
            if (loopInput == 4) {
                System.out.println("Skriv titel på den film du ønsker at finde:");

                MovieCollection movieCollection = controller.movieCollection;
                String word = scanner.next();

//                String word = scanner.next();
                System.out.println("Der var denne film i din filmsamling ");
                System.out.println(controller.returnSearchMovie(word));
                System.out.println("");

            }
        }
    }
}






