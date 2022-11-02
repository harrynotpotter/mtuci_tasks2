package task2;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println(repeat("mice", 5));
        System.out.println(repeat("hello", 3));
        System.out.println(repeat("stop", 1));
    }

    private static String repeat(String word, int count){
        String res = "";
        for (int i = 0; i<word.length(); i++) {
            for (int j = 0; j < count; j++){
                res += word.charAt(i);
            }
        }
        return res;
    }
}
