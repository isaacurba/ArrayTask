import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskThreeTest{
    @Test
    public void testToGetOddNumbersFromAnArray(){
        int[] number = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] expectedValue = {1, 3, 5, 7, 9};
        int[] actualvalue = TaskThree.oddNumbersInArray(number);
        assertArrayEquals(expectedValue, actualvalue);

    }
}
