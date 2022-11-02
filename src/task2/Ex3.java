package task2;

import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println("isAvgWhole 1");
        System.out.println(isAvgWhole(new int[]{1, 3}));
        System.out.println(isAvgWhole(new int[]{1, 2, 3, 4}));
        System.out.println(isAvgWhole(new int[]{1, 5, 6}));
        System.out.println(isAvgWhole(new int[]{1, 1, 1}));
        System.out.println(isAvgWhole(new int[]{9, 2, 2, 5}));

        System.out.println("isAvgWhole 2");
        System.out.println(isAvgWhole2(new int[]{1, 3}));
        System.out.println(isAvgWhole2(new int[]{1, 2, 3, 4}));
        System.out.println(isAvgWhole2(new int[]{1, 5, 6}));
        System.out.println(isAvgWhole2(new int[]{1, 1, 1}));
        System.out.println(isAvgWhole2(new int[]{9, 2, 2, 5}));
    }

    //первое решение
    private static boolean isAvgWhole(int[] arr) {
        return (Arrays.stream(arr).average().getAsDouble()) % 1 == 0;
    }

    //второе решение
    private static boolean isAvgWhole2(int[] arr) {
        double avg = 0;
        for (int i : arr) {
            avg += i;
        }
        return (avg / arr.length) % 1 == 0;
    }

}
