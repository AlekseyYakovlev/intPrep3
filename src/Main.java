import java.awt.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr1= {9,5,3,4,2,7,6,8,1};
        System.out.println(Arrays.toString(arr1));
        InsertionSort.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        System.out.println();
        System.out.println("Fibonacci numbers:");
        System.out.println(Arrays.toString(Fibonacci.calculate(20)));



    }
}
