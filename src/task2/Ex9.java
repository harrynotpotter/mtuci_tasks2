package task2;

public class Ex9 {
    public static void main(String[] args) {
        System.out.println(isPrefix("automation", "auto-"));
        System.out.println(isSuffix("arachnophobia", "-phobia"));
        System.out.println(isPrefix("retrospect", "sub-"));
        System.out.println(isSuffix("vocation", "-logy"));
    }

    private static boolean isPrefix(String word, String prefix) {
        return word.startsWith(prefix.substring(0,prefix.length()-1));
    }

    private static boolean isSuffix (String word, String suffix) {
        return word.endsWith(suffix.substring(1));
    }
}
