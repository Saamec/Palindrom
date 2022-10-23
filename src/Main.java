
import java.util.Scanner;

class GFG {
    public static boolean isPalindrome(String str)
    {
        String rev = "";
        boolean ansver = false;

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            ansver = true;
        }
        return ansver;
    }
    public static void main(String[] args)
    {
        System.out.println("Введите слово для проверки на палиндром");
        Scanner pall = new Scanner(System.in);
        String str = pall.next();
        str = str.toLowerCase();
        boolean A = isPalindrome(str);
        System.out.println(A);
    }
}
