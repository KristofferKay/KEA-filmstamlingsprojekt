import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.*;

public class UserInterface {

    // variables to be used in the whole class scope
    Scanner scanner = new Scanner(System.in);
    Controller controller = new Controller();

    public void run() {

        // variables
        final int SENTINEL = 2;
        int loopInput = 0;

        // setting scanner obj to use Delimiter metohd. Delimiter ensures whenever we use the scanner obj that we will in this case always go to next line,
        scanner.useDelimiter("\n");
        //sout to add space in terminal
        System.out.println();

        // while loop with sentinel. Sentinel ensures we can break out of the loop by typing the sentiel in the terminal.
        while (loopInput != SENTINEL) {
            System.out.println("Velkommen til din filmsamling");
            System.out.println("1. Opret film");
            System.out.println("2. Afslut");
            System.out.println("3. Se din filmsamling");
            System.out.println("4. Søg på din filmsamling");
            System.out.println("5. Rediger en film");
            System.out.println("6. Slet en film");
            loopInput = scanner.nextInt();
            // if loop to check if userInput is 1
            if (loopInput == 1) {
                // calls CreateMovie obj
                CreateMovie();
            }

            // TILFØJ IF ELSE LOOP I STEDET
            // stops the process
            if (loopInput == 2) {
                System.out.println("Du har afsluttet processen");
                break; // breaks out of the loop
            }

            // Write movie collection to user
            if (loopInput == 3) {

                // Calls PrintMovie obj
                PrintMovie();
            }
            // search for movie in collection based on title
            if (loopInput == 4) {

                // Calls SearchForMovie obj
                SearchForMovie();
            }

            if (loopInput == 5) {
                editMovie();
            }

            if (loopInput == 6) {
                deleteMovie();
            }
        }
    }

    public void CreateMovie() {
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
        int lengthInMinutes = 0;

        // EXEPTIONS
        boolean done = false;
        while (!done) {
            try {
                lengthInMinutes = scanner.nextInt();
                done = true;
            } catch (InputMismatchException ime) {
                System.out.println("Fejl. Skriv som tal, prøv igen");
                scanner.nextLine();
            }
        }

        System.out.println("Hvad er genre");
        String genre = scanner.next();

        System.out.println("Hvilen år er filmen lavet");
        int yearsCreated = 0;

        // EXPEPTION
        done = false;
        while (!done) {
            try {
                yearsCreated = scanner.nextInt();
                done = true;
            } catch (InputMismatchException ime) {
                System.out.println("Fejl. Skriv som tal, prøv igen");
                scanner.nextLine();
            }
        }

        // we parse our arguments to our addMovieController method in our controller class, via our obj controller.
        controller.addMovieController(title, director, isInColor, lengthInMinutes, genre, yearsCreated);

        System.out.println("Du har tilføjet " + title + " til din samling");
        System.out.println("");

    }

    public void PrintMovie() {
        System.out.println("Din filmsamling:");

        // printout movie collection
        System.out.println(controller.returnMovieString());
    }

    public void SearchForMovie() {
        System.out.println("Skriv titel på den film du ønsker at finde:");
        MovieCollection movieCollection = controller.movieCollection;
        String word = scanner.next();

        System.out.println("Der var denne film i din filmsamling ");
        System.out.println(controller.returnSearchMovie(word));
        System.out.println("");
    }

    public void editMovie() {
        System.out.println("Skriv titel på den film, du ønsker at redigere");
        String titleToEdit = scanner.next();

        ArrayList<Movie> movieArray = controller.movieCollection.getMovieArray();

        for (Movie editMovieArray : movieArray) {
            if (editMovieArray.getTitle().equals(titleToEdit)) {
                System.out.println("Skriv tallet på den værdi du ønsker at ændre ");
                System.out.println("1. Title");
                System.out.println("2. Direktør");
                System.out.println("3. Genrer");
                System.out.println("4. Årstal");
                System.out.println("5. Er film i farver");
                System.out.println("6. Film længden");
                int editMovieMenu = scanner.nextInt();


                if (editMovieMenu == 1) {
                    System.out.println("Angiv ny titel:");
                    String newTitle = scanner.next();
                    editMovieArray.setTitle(newTitle);
                }
                if (editMovieMenu == 2) {
                    System.out.println("Angiv ny direktør:");
                    String newDirector = scanner.next();
                    editMovieArray.setDirector(newDirector);

                }
                if (editMovieMenu == 3) {
                    System.out.println("Angiv ny genre:");
                    String newGenre = scanner.next();
                    editMovieArray.setGenre(newGenre);

                }
                if (editMovieMenu == 4) {
                    System.out.println("Angiv nyt årstal:");
                    try {
                        int newYearsCreated = scanner.nextInt();
                        editMovieArray.setYear(newYearsCreated);
                    } catch (Exception e) {
                        System.out.println("Fejl. Skriv som Tal");
                        int newYearsCreated = scanner.nextInt();
                        editMovieArray.setYear(newYearsCreated);
                    }

                }
                if (editMovieMenu == 5) {
                    System.out.println("Er film i farver?");
                    boolean newIsInColor = scanner.nextBoolean();
                    editMovieArray.setColor(newIsInColor);
                }
                if (editMovieMenu == 6) {
                    System.out.println("Angiv ny film længde i minutter:");
                    int newLengthInMinutes = scanner.nextInt();
                    editMovieArray.setLengthInMinutes(newLengthInMinutes);

                    // AFTER EDITING MSG
                    System.out.println("Du sendes tilbage til hovedmenu");
                    System.out.println("----------------");
                    System.out.println("Du har nu ændret værdien");
                    System.out.println("Her er et udprint af din nye film, i filmsamlingen");
                }
            }
        }
    }
    public void deleteMovie() {
        System.out.println("Skriv titel på den film du ønsker at slette:");
        String delMovieTitle = scanner.next();

//        MovieCollection movieCollection = controller.movieCollection; // UNCOMMENT FØR DET VIRKER
        String deletedMovieTitle = controller.returnDelMovie(delMovieTitle);
        System.out.println("Du har slettet " + deletedMovieTitle + " fra din filmsamling");

    }
}


