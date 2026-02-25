import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextInt();
        long d = scanner.nextInt();

        System.out.println(digitCount(n, d));
        
    }

    // digitCount() will recurse once for every digit in the number N, which means it is O(log n), 
    // with n being the input number N. 
    public static int digitCount(long searchNum, long digit) {
        if(searchNum == 0) {
            return 0;
        } else if(searchNum % 10 == digit) {
            return 1 + digitCount(searchNum / 10, digit);
        } else {
            return digitCount(searchNum / 10, digit);
        }
    }
}