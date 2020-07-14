import java.util.Scanner;

public class ElementsInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numInts = scan.nextInt();
        int[] intList = new int[20];

        for (int i = 0; i < numInts; i++) {
            intList[i] = scan.nextInt();
        }

        int low = scan.nextInt();
        int high = scan.nextInt();

        for (int i = 0; i < numInts; i++) {
            if (intList[i] <= high && intList[i] >= low) {
                System.out.print("" + intList[i] + " ");
            }
        }
        System.out.println("");
    }
}
