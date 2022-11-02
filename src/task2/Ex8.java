package task2;

public class Ex8 {
    public static void main(String[] args) {
        System.out.println(isStrangePair("ratio", "orator"));
        System.out.println(isStrangePair("sparkling", "groups"));
        System.out.println(isStrangePair("bush", "hubris"));
        System.out.println(isStrangePair("",""));
    }

    private static boolean isStrangePair(String str1, String str2) {
        if (str1.isEmpty() && str2.isEmpty()){
            return true;
        }
        try {
            return str1.charAt(0) == str2.charAt(str2.length() - 1) && str1.charAt(str1.length() - 1) == str2.charAt(0);
        } catch (StringIndexOutOfBoundsException exception) {
            return false;
        }
    }
}
