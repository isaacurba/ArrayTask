import java.util.Arrays;

public class TaskFive {
    public static int[] excludeDuplicateArray(int[] arr){
        int[] excludeDuplicate = new int[arr.length];
        int nLength = 0;
        
        for (int index = 0; index < arr.length; index++) {
            int count;
            
            for (count = 0; count < arr.length; count++) {
                if (arr[index] == arr[count]) {
                    break;
                }
            }
            
            if (index == count) {
                excludeDuplicate[nLength] = arr[index];
                nLength++;
            }
        }
        
        int[] result = Arrays.copyOf(excludeDuplicate, nLength);
        return result;
    }
}

