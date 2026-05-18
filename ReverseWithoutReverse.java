import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElimination {
    public static void main(String... args){
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];

        for (int index = 0; index < numbers.length; index++){
            System.out.printf("Enter %dth number : ", index+1);
            int value = input.nextInt();
            numbers[index] = value;
        }

        for (int index = 0; index < numbers.length/2; index++){
            int value = numbers[index];
            int reverse = (numbers.length - index) - 1;
            int temp = 0;


            numbers[index] = value;
            temp = numbers[index];
            numbers[index] = numbers[reverse];
            numbers[reverse] = temp;
            reverse--;

        }
        System.out.println();
        System.out.println();
        System.out.print(Arrays.toString(numbers));




    }
}
