import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // INPUT FORMAT:
        // first line is amount of integers, followed by the integers listed out line by line
        int listSize = scanner.nextInt();
        int[] integers = new int[listSize];
        for(int i = 0; i < listSize; i++) {
            integers[i] = scanner.nextInt();
        }

        System.out.println(sumEven(integers, listSize - 1, 0));
        
    }

    // sumEven will recurse once for every item in the integer list, so it is O(n), with n being 
    // the length of the input list.
    public static int sumEven(int[] list, int index, int sum) {
        if(index == -1) {
            return sum;
        } else if (list[index] % 2 == 0) {
            return list[index] += sumEven(list, index - 1, sum);
        } else {
            return sumEven(list, index - 1, sum);
        }
    }
}