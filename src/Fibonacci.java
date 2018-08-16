public class Fibonacci {

    public static int[] calculate(int steps){
        int[] array = new int [steps+1];
        array[0]=0;
        array[1]=1;

        for (int i = 2; i <= steps; i++) {
            array[i]=array[i-2]+array[i-1];
        }
        return array;
    }
}
