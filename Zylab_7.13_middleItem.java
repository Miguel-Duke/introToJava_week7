import java.util.Scanner;

public class MiddleItem {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] userValues = new int[9];
        int numPos = 0;
        int tempVal = 0;
        int i = 0;
        boolean overflow = false;

        while (tempVal != -1) {
            tempVal = scnr.nextInt();
            if (i > 8) {
                if (tempVal < 0) {
                    break;
                } else {
                    overflow = true;
                    break;
                }
            } else if (tempVal < 0) {
                userValues[i] = tempVal;
                i++;
                continue;
            } else {
                userValues[i] = tempVal;
                i++;
            }
        }

        if (overflow == true) {
            System.out.println("Too many inputs");
        } else {
            for (i = 0; i < userValues.length; i++) {
                if (userValues[i] < 0) {
                    numPos = i;
                    break;
                }
                if (userValues[8] > 0) {
                    numPos = 8;
                }
            }
            numPos = numPos / 2;
            System.out.println(userValues[numPos]);
        }


    }
}
