import java.util.Arrays;

public class TryDiffComplexity {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 1, 8};
        System.out.println(Arrays.toString(doSort(arr)));
        int[] arr2 = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(doSort(arr2)));
        int[] arr3 = {1, 4, 2, 3, 5};
        System.out.println(Arrays.toString(doSort(arr3)));
        int[] arr4 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(doSort(arr4)));
    }

    public static int[] doSort(int[] arr) {
        int counter = 0;
        for (int x = 0; x < arr.length - 1; x++) {
            if (arr[x] > arr[x + 1]) {
                int num = arr[x];
                arr[x] = arr[x + 1];
                arr[x + 1] = num;
                x = -1;
            }
            counter++;
        }
        System.out.println(counter);
        return arr;
    }
}
