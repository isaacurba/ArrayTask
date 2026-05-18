import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskSixTest {

    @Test
    public void testToSortTheArrayInAscendingOrder() {
        int[] arr = {5, 4, 3, 2, 1, 10, 9, 8, 7, 6};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] actual = TaskSix.ascending(arr);
      
        assertArrayEquals(expected, actual); 
    }
}

