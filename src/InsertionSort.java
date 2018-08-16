public class InsertionSort {
    private static int[] array;

    public static int[] sort(int[] ar) {
        for (int i = 1; i < ar.length; i++) {
            for (int j = i; j > 0; j--) {
                if (ar[j] < ar[j - 1]) swap(ar, j, j - 1);
                else break;
            }
        }
        return ar;
    }

    private static void swap(int[] ar, int a, int b) {
        int temp = ar[a];
        ar[a] = ar[b];
        ar[b] = temp;
    }
}
