
import java.util.Arrays;
public class TaskTwo {

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        System.out.print(Arrays.toString(reverseArray(arr)));
    }

    public static int[] reverseArray(int[] arr){
        int[] reverse = new int[arr.length];
        int count = 0;

        for (int index = arr.length - 1; index >= 0; index--){
            reverse[count] = arr[index];
            count++;
        }
        return reverse;
    }
}
