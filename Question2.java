import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String searchString = scanner.nextLine();
        String searchChar = scanner.nextLine();

        System.out.println(charCount(searchString, searchChar));
        
    }

    // charCount() will recurse once for every character in the search string, so it is O(n) with n being 
    // the length of the search string.
    public static int charCount(String s, String c) {
        if(s.length() == 0) {
            return 0;
        } else if(s.charAt(0) == c.charAt(0)){
            return 1 + charCount(s.substring(1, s.length()), c);
        } else {
            return charCount(s.substring(1, s.length()), c);
        }
    }
}