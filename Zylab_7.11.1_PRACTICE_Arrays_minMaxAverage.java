import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int[] userValues = new int[10];
        int i;

        for (i = 0; i < 10; ++i) {
            userValues[i] = scnr.nextInt();
        }

        int minVal = userValues[0];
        int maxVal = userValues[0];
        int sumVals = 0;

        for (i = 0; i < userValues.length; i++) {
            if (userValues[i] < minVal) {
                minVal = userValues[i];
            }
            if (userValues[i] > maxVal) {
                maxVal = userValues[i];
            }
            sumVals = sumVals + userValues[i];
        }

        System.out.println("" + minVal + " " + maxVal + " " + (sumVals / 10.0));
    }
}
