package Packages;

public class NewExample {
    public static void main(String[] args) {
        // String palabra = "caminito";
        // char[] dst = new char[2];

        // palabra.getChars(palabra.length() - 2, palabra.length(), dst, 0);

        // System.out.println(String.copyValueOf(dst));

        System.out.println(solution("ails", "fails"));
    }

    public static boolean solution(String str, String ending) {

        if (ending.length() <= str.length()) {
            char[] dst = new char[ending.length()];
            str.getChars(str.length() - ending.length(), str.length(), dst, 0);
            if (ending.equals(String.copyValueOf(dst))) {
                return true;
            }
        }
        return false;
    }
}
