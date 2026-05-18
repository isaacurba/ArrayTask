import java.util.Arrays;

public class TaskSix {
    
    public static void main(String... args){
        
        int[] arr = {5, 4, 3, 2, 1, 10, 9, 8, 7, 6};
        
        System.out.print(Arrays.toString(ascending(arr)));
    }
    
    
    public static int[] ascending(int[] arr){
        int[] ascending = new int[arr.length];
        
        for (int index = 0; index < arr.length; index++){
            for (int count = 0; index < arr.length; count++){
                
                if (arr[index] > arr[count]){
                    int temp = arr[index];
                    arr[index] = arr[count];
                    ascending[count] = temp;
                }
            }
        }
        return ascending;
    }
}
