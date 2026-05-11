import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskTwoTest {
    @Test
    public void testToCollectTenDigitInAnArrayAndReturnTheArray(){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] expectedAnswer = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] actualValue = TaskTwo.reverseArray(arr);
        assertArrayEquals(expectedAnswer, actualValue);
    }
}
