import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        System.out.println(reverse(s));
        
    }

    // reverse() will recurse once for every character in the input string, so it is O(n), with n being
    // the length of the input string.
    public static String reverse(String input) {
        if(input.length() == 1) {
            return input;
        } else {
            return input.charAt(input.length() - 1) + reverse(input.substring(0, input.length() - 1));
        }
    }
}