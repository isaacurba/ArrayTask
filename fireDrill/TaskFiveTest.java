import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskFiveTest {
    
    @Test
    public void testToRemoveDuplicateFromAnArray(){
        int[] arr = {1, 2, 2, 2, 2, 5, 5, 5, 7, 10};
        int[] expected = {1, 2, 5, 7, 10}; 
        int[] actual = TaskFive.excludeDuplicateArray(arr);
        assertArrayEquals(expected, actual);
    }

}
