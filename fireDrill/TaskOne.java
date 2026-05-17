import java.util.Arrays;
import java.util.Scanner;

public class TaskOne {

    public static void main(String[] args){

        int[] result = collectInput(10);

        System.out.println(Arrays.toString(result));
    }

    public static int[] collectInput(int size){

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[size];

        for(int index = 0; index < numbers.length; index++){
            numbers[index] = input.nextInt();
        }

        return numbers;
    }
}
