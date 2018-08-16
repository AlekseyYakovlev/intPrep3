import java.awt.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr1 = {9, 5, 3, 4, 2, 7, 6, 8, 1};
        System.out.println(Arrays.toString(arr1));
        InsertionSort.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        System.out.println();
        System.out.println("Fibonacci numbers:");
        System.out.println(Arrays.toString(Fibonacci.calculate(20)));

        CustomVectorList<Integer> list = new CustomVectorList<>();
        list.add(5);
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(6);
        list.goToFirst();

        while (list.hasNext()) System.out.println(list.next().toString());

        System.out.println("Prime numbers < 200:");
        System.out.println(PrimeNumbers.find(400).toString());

    }
}
