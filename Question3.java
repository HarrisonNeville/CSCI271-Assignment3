import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // INPUT FORMAT:
        // first line is amount of integers, followed by the integers listed out line by line
        int listSize = scanner.nextInt();
        int[] integers = new int[listSize];
        for(int i = 0; i < listSize; i++) {
            integers[i] = scanner.nextInt();
        }

        System.out.println(max(integers, listSize - 1, integers[0]));
        
    }

    // max() will recurse once for every item in the input list, so it is O(n) with n being the size of
    // the input list.
    public static int max(int[] list, int index, int max) {
        if(index == -1) {
            return max;
        } else if (list[index] > max) {
            return max(list, index - 1, list[index]);
        } else {
            return max(list, index - 1, max);
        }
    }
}