import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfishaTest {
    Afisha afisha = new Afisha();

    @Test

    public void test() {

        afisha.add("Movie 1");
        afisha.add("Movie 2");
        afisha.add("Movie 3");
        afisha.add("Movie 4");

        String[] actual = afisha.findAll();
        String[] expectual = {"Movie 1", "Movie 2", "Movie 3", "Movie 4"};


    }

    @Test

    public void testLast() {
        Afisha afisha = new Afisha(1);

        afisha.add("Movie 1");
        afisha.add("Movie 2");
        afisha.add("Movie 3");
        afisha.add("Movie 4");

        String[] expectual = {"Movie 4"};
        String[] actual = afisha.findLast();


        Assertions.assertArrayEquals(expectual, actual);
    }

    @Test

    public void testLa() {
        Afisha afisha = new Afisha(20);

        afisha.add("Movie 1");
        afisha.add("Movie 2");
        afisha.add("Movie 3");
        afisha.add("Movie 4");
        afisha.add("Movie 5");
        afisha.add("Movie 6");
        afisha.add("Movie 7");
        afisha.add("Movie 8");

        String[] expectual = {"Movie 8", "Movie 7", "Movie 6", "Movie 5", "Movie 4", "Movie 3", "Movie 2", "Movie 1"};
        String[] actual = afisha.findLast();
        Assertions.assertArrayEquals(expectual, actual);
    }

    @Test

    public void testlastlimit() {
        Afisha afisha = new Afisha(10);

        afisha.add("Movie 1");
        afisha.add("Movie 2");
        afisha.add("Movie 3");
        afisha.add("Movie 4");
        afisha.add("Movie 5");
        afisha.add("Movie 6");
        afisha.add("Movie 7");
        afisha.add("Movie 8");
        afisha.add("Movie 9");
        afisha.add("Movie 10");
        afisha.add("Movie 11");

        String[] expectual = {"Movie 11", "Movie 10", "Movie 9", "Movie 8", "Movie 7", "Movie 6", "Movie 5", "Movie 4", "Movie 3", "Movie 2"};
        String[] actual = afisha.findLast();
        Assertions.assertArrayEquals(expectual, actual);
    }

    @Test

    public void TestEqually() {
        Afisha afisha = new Afisha(10);

        afisha.add("Movie 1");
        afisha.add("Movie 2");
        afisha.add("Movie 3");
        afisha.add("Movie 4");
        afisha.add("Movie 5");
        afisha.add("Movie 6");
        afisha.add("Movie 7");
        afisha.add("Movie 8");
        afisha.add("Movie 9");
        afisha.add("Movie 10");


        String[] expectual = {"Movie 10", "Movie 9", "Movie 8", "Movie 7", "Movie 6", "Movie 5", "Movie 4", "Movie 3", "Movie 2", "Movie 1"};
        String[] actual = afisha.findLast();
        Assertions.assertArrayEquals(expectual, actual);
    }

}
