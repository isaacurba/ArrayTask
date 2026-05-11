import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskOneTest {
    @Test
    public void testToCollectTenDigitInAnArrayAndReturnTheArray(){
        int number = 10;
        int[] expectedAnswer = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] actualValue = TaskOne.inputCollectorToArray(number);
        assertEquals(expectedAnswer, actualValue);
    }
}
