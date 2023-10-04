import static org.junit.Assert.*;

public class AdditionTest {

    @org.junit.Test
    public void add() {
        int result=Addition.add(3,3);
        int correct=6;
        assertEquals(6,result);
    }
}