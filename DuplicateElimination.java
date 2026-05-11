import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElimination {
    public static void main(String... args){
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];

        System.out.println("Enter number from from 10 - 100");

        for (int index = 0; index < numbers.length; index++){

            System.out.printf("Enter number %d: ", index+1);
            int value = input.nextInt();

            if (value >= 10 && value <= 100){
                numbers[index] = value;
            }else{
                System.out.print("Enter a value between 10 - 100.");
                index--;
            }

        }
        System.out.print(Arrays.toString(numbers));
    }
}
