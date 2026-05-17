import java.util.Arrays;
public class TaskThree {

    public static void main(String... args){

        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print(Arrays.toString(oddNumbersInArray(arr)));
    }

    public static int[] oddNumbersInArray(int[] arr){
        int count = 0;
        for (int index = 0; index < arr.length; index++){
            if (arr[index] % 2 != 0)count++;   
        }
        
        int[] oddNumber = new int[count];
        int position = 0;
        
        for(int index = 0; index < arr.length; index++){
            if (arr[index] % 2 != 0){
                oddNumber[position++] = arr[index];
            }
        }
        
        return oddNumber;

    }
}
