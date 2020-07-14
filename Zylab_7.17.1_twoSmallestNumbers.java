import java.util.Scanner;
import java.util.Arrays;

public class TwoSmallest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numInts = scan.nextInt();
        int[] intList = new int[numInts];

        for (int i = 0; i < numInts; i++) {
            intList[i] = scan.nextInt();
        }

        Arrays.sort(intList);

        System.out.println("" + intList[0] + " " + intList[1]);

    }
}
