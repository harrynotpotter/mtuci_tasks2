package task2;

public class Ex10 {
    public static void main(String[] args) {
        System.out.println(hexLattice(1));
        System.out.println();
        System.out.println(hexLattice(7));
        System.out.println();
        System.out.println(hexLattice(19));
        System.out.println();
        System.out.println(hexLattice(21));
    }

    public static String hexLattice(int num) { //проверяем первый символ
        if (num == 1) {
            return " * ";
        } else if (num < 0) {
            return "Invalid";
        }

        double n = (3 + Math.sqrt(12 * num - 3)) / 6;

        if (n - (int)n != 0) {
            return "Invalid";
        }

        int i = (int)n;
        StringBuilder upperPart = new StringBuilder();

        for(int up = 0; up < (int)n; up++)
        {
            upperPart.append(" ".repeat((int)n - up));
            upperPart.append("* ".repeat(i));
            upperPart.append(" ".repeat((int)n - up - 1));
            i++;
            upperPart.append("/n");
        }

        StringBuilder strBuffer = new StringBuilder(upperPart.toString());
        String bottomPart = strBuffer.reverse().toString();
        bottomPart = bottomPart.substring(bottomPart.indexOf(("n/"), 2) + 2);
        bottomPart = bottomPart.replaceAll("n/", "\n");

        return upperPart.toString().replaceAll("/n", "\n") + bottomPart;
    }
}
