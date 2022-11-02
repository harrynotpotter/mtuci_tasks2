package task2;

import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println(differenceMaxMin(new int[]{10, 4, 1, 4, -10, -50, 32, 21}));
        System.out.println(differenceMaxMin(new int[]{44, 32, 86, 19}));
        System.out.println(differenceMaxMin2(new int[]{10, 4, 1, 4, -10, -50, 32, 21}));
        System.out.println(differenceMaxMin2(new int[]{44, 32, 86, 19}));
    }

    //первое решение
    private static int differenceMaxMin(int[] arr) {
        return (Arrays.stream(arr).max()).getAsInt() - (Arrays.stream(arr).min()).getAsInt();
    }

    //второе решение
    private static int differenceMaxMin2(int[] arr) {
        int max = arr[0], min = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        return (max - min);
    }
}
