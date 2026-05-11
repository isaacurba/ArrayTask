import java.util.Scanner;
import java.util.Arrays;
public class TaskOne {

    public static void main(String[] args){
        System.out.print(Arrays.toString(inputCollectorToArray(10)));
    }

    public static int[] inputCollectorToArray(int number){
        Scanner input = new Scanner(System.in);
        int[] arr = new int[number];
        for (int index = 0; index < arr.length; index++){
            int digit = input.nextInt();
            arr[index] = digit;
        }
        return arr;
    }
}
