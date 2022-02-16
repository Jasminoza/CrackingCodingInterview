import java.util.ArrayList;
import java.util.Arrays;

public class DecompressRunLengthEncodedList {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        System.out.println(Arrays.toString(decompressRLElist(a))); // should be [2,4,4,4]
        int[] b = {1, 1, 2, 3};
        System.out.println(Arrays.toString(decompressRLElist(b))); // should be [1,3,3]
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
