import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MovieCollectionTest {

    // søg på 0 film
    @Test
    void getMovieArray() {
        // arrange
        MovieCollection searchMovieOjb = new MovieCollection();
        // act
        int actualSize = searchMovieOjb.getMovieArray().size();
        // assert
        int expectedResult = 0;
        assertEquals(expectedResult, actualSize);

    }

    // søg på 1 film
    @Test
    void getMovieArray2() {
        // arrange
        MovieCollection searchMovieOjb = new MovieCollection();
        // act
        searchMovieOjb.addMovie("filmtitle", "director", true, 22, "action", 222);

        int actualSize = searchMovieOjb.getMovieArray().size();
        // assert
        int expectedResult = 1;
        assertEquals(expectedResult, actualSize);
    }

    // søg på 2 eller flere film
    @Test
    void getMovieArray3() {
        // arrange
        MovieCollection searchMovieOjb = new MovieCollection();
        // act
        searchMovieOjb.addMovie("filmtitle1", "director", true, 22, "action", 222);
        searchMovieOjb.addMovie("filmtitle2", "director", true, 22, "action", 222);
        searchMovieOjb.addMovie("filmtitle3", "director", true, 22, "action", 222);
        int actualSize = searchMovieOjb.getMovieArray().size();
        int expectedResult = actualSize;
        // assert
        assertEquals(expectedResult, actualSize);

    }

    @Test
    void addMovie() {

        // arrange
        MovieCollection addMovieObj = new MovieCollection();
        // act
        addMovieObj.addMovie("filmtitle", "director", true, 22, "action", 222);
        int actualSize = addMovieObj.getMovieArray().size();

        // assert
        int expectedResult = 1;
        assertEquals(expectedResult,actualSize);
    }

    @Test
    void addMovie2() {
        //arrange
        MovieCollection addMovieObj = new MovieCollection();
        //act
        addMovieObj.addMovie("filmtitle", "director", true, 22, "action", 222);
        addMovieObj.addMovie("filmtitle2", "director", false, 22, "action", 222);
        int actualSize = addMovieObj.getMovieArray().size();
        //assert
        int expectedResult = 2;
        assertEquals(expectedResult, actualSize);
    }
}


