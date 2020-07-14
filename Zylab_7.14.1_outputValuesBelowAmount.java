import java.util.Scanner;

public class OutputValuesBelow {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] userValues = new int[20];
        int threshold = 0;
        int listLen = scnr.nextInt();

        for (int i = 0; i < listLen + 1; i++) {
            if (i == listLen) {
                userValues[i] = scnr.nextInt();
                threshold = userValues[i];
            } else {
                userValues[i] = scnr.nextInt();
            }
        }

        for (int i = 0; i < listLen + 1; i++) {
            if (userValues[i] < threshold) {
                System.out.print("" + userValues[i] + " ");
            }
        }
        System.out.println("");

    }
}
