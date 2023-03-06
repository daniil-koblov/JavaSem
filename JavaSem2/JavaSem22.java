package JavaSem2;

public class JavaSem22 {
    public static void main(String[] args) {
        String str = System.console().readLine().replace(" ", "").toLowerCase();
        System.out.println(polindromeCheck(str));
    }
    public static boolean polindromeCheck(String str) {
        char[] chars = str.toCharArray();
        boolean check = true;
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) {
                check = false;
                break;
            }
        }
        return check;
    }
}
