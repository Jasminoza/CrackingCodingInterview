import java.util.ArrayList;
import java.util.Arrays;

public class DecompressRunLengthEncodedList {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        System.out.println(Arrays.toString(decompressRLElist(a))); // should be [2,4,4,4]
        int[] b = {1, 1, 2, 3};
        System.out.println(Arrays.toString(decompressRLElist(b))); // should be [1,3,3]
        int[] c = {7, 2, 1, 3, 4, 6, 9, 8};
        System.out.println(Arrays.toString(decompressRLElist(c))); // should be [2, 2, 2, 2, 2, 2, 2, 3, 6, 6, 6, 6, 8, 8, 8, 8, 8, 8, 8, 8, 8]
    }

    public static int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        int val = 0;
        for (int freq = 0; freq < nums.length; freq = freq + 2) {
            val = nums[freq + 1];

            for (int counter = 0; counter < nums[freq]; counter++) {
                arr.add(val);
            }
        }
        return arr.stream().mapToInt(i -> i).toArray();
    }
}
