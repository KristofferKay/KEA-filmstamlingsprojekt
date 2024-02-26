import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        // variables
        final int SENTINEL = 2;
        int loopInput = 0;


        // Adding new Scanner obj named scanner
        Scanner scanner = new Scanner(System.in);
        // setting scanner obj to use Delimiter metohd. Delimiter ensures whenever we use the scanner obj that we will in this case always go to next line,
        scanner.useDelimiter("\n");
        //sout to add space in terminal
        System.out.println();
        // obj for a new obj called controller, from the controller class
        Controller controller = new Controller();

        // while loop with sentinel. Sentinel ensures we can break out of the loop by typing the sentiel in the terminal.
        while (loopInput != SENTINEL) {
            System.out.println("Velkommen til din filmsamling");
            System.out.println("1. Opret film");
            System.out.println("2. Afslut");
            System.out.println("3. Se din filmsamling");
            System.out.println("4. Søg på din filmsamling");
            loopInput = scanner.nextInt();
            // if loop to check if userInput is 1
            if (loopInput == 1) {

                // user input
                System.out.println("Hvad er navnet på filmen?");
                String title = scanner.next();

                System.out.println("Hvem har skrevet filmen");
                String director = scanner.next();

                System.out.println("Er filmen i farver, skriv ja eller nej");
                // boolean that set isIncolor to false
                boolean isInColor = false;
                // we take the input from user and add it to string
                String erIFarve = scanner.next();
                // we ensures the string is in lowercase, so its easier to work with
                erIFarve = erIFarve.toLowerCase();
               // if loop to ensure that erIFarve is equal to the userinput Ja. If true, isInColor is changed to true, if not, nothing happen eg its false.
                if (erIFarve.equals("ja")) {
                    isInColor = true;
                }

                System.out.println("Hvor lang er filmen i minutter");
                int lengthInMinutes = scanner.nextInt();

                System.out.println("Hvad er genre");
                String genre = scanner.next();

                System.out.println("Hvilen år er filmen lavet");
                int yearsCreated = scanner.nextInt();

                // we parse our arguments to our addMovieController method in our controller class, via our obj controller.
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






