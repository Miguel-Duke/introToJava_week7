import java.util.Scanner;

public class ContainsTheCharacter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] words = new String[20];
        int wordCount = scan.nextInt();
        char letter;

        for (int i = 0; i < wordCount; i++) {
            words[i] = scan.next();

        }

        letter = scan.next().charAt(0);

        for (int i = 0; i < wordCount; i++) {
            if (words[i].indexOf(letter) != -1) {
                System.out.println(words[i]);
            }
        }
    }
}
