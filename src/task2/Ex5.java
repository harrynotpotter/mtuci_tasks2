package task2;

public class Ex5 {
    public static void main(String[] args) {
        System.out.println(getDecimalPlaces("43.20"));
        System.out.println(getDecimalPlaces("400"));
        System.out.println(getDecimalPlaces("3.1"));
    }

    private static int getDecimalPlaces(String str) {
        if (str.indexOf(".") == -1) {
            return 0;
        }
        return str.indexOf(".");
    }
}
