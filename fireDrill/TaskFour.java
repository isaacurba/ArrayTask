import java.util.Arrays;
public class TaskFour {

    public static void main(String... args){

        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print(Arrays.toString(evenNumbersInArray(arr)));
    }

    public static int[] evenNumbersInArray(int[] arr){
        int count = 0;
        for (int index = 0; index < arr.length; index++){
            if (arr[index] % 2 == 0)count++;
        }
        
        int[] evenNumber = new int[count];
        int position = 0;
        for (int index = 0; index < arr.length; index++){
            if (arr[index] % 2 == 0){
                evenNumber[position++] = arr[index];
            }
        }
        
        
        return evenNumber;

    }
}
