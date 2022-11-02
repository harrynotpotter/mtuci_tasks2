package task2;

public class Ex7 {
    public static void main(String[] args) {
        System.out.println(isValid("59001"));
        System.out.println(isValid("853a7"));
        System.out.println(isValid("732 32"));
        System.out.println(isValid("393939"));
    }

    private static boolean isValid(String str) {
        try {
            Integer.parseInt(str);
            return str.length()==5;
        } catch (NumberFormatException exception) {
            return false;
        }
    }
}
