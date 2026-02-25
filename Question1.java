import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(stringLen(scanner.nextLine()));

    }

    // stringLen() will recurse once for every character in the input string, so it is O(n) with n being
    // the length of the input string.
    public static int stringLen(String s) {
        if(s.length() == 0) {
            return 0;
        } else {
            return 1 + stringLen(s.substring(0, s.length() - 1));
        }
    }
}