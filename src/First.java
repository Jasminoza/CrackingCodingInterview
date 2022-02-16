import java.util.Arrays;

/**
 * Напишите метод, генерирующий случайную последовательность m целых чисел из массива размером n.
 * Все элементы выбираются с одинаковой вероятностью.
 */

public class First {
    public static void main(String[] args) {
        int m = 3;
        int n = 5;
        System.out.println(Arrays.toString(createRandomArr(m, n))); // выводим m чисел из массива размером n.
        m = 7; n =20;
        System.out.println(Arrays.toString(createRandomArr(m, n))); // выводим m чисел из массива размером n.
    }

    public static int[] createRandomArr(int m, int n) {
        int[] arr = new int[n];
        int[] arr2 = new int[m];
        for (int x = 0; x < m; x++) {
            arr[x] = (int) (Math.random() * 100 - 1);
        }
        System.out.println("Исходный массив: " + Arrays.toString(arr));

        for (int y = 0; y < m; y++) {
            arr2[y] = arr[(int) (Math.random() * m)];
        }
        System.out.print("Массив из случайных m чисел: ");
        return arr2;
    }
}
