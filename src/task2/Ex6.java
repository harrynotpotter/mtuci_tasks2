package task2;

public class Ex6 {
    public static void main(String[] args) {
        // В word файле неверное условие Fibonacci(3) ➞ 3

        System.out.println(Fibonacci(3));
        System.out.println(Fibonacci(7));
        System.out.println(Fibonacci(12));

        System.out.println(Fibonacci2(3));
        System.out.println(Fibonacci2(7));
        System.out.println(Fibonacci2(12));
    }


    //первый способ через рекурсию
    private static int Fibonacci(int n) {
        if (n <= 2) {
            return n;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }

    //второй способ через for
    private static int Fibonacci2(int n) {
        int first = 1, second = 1, res = n;
        for (int i = 1; i < n; i++) {
            res = first + second;
            first = second;
            second = res;
        }
        return res;
    }
}
