//Write a program in Java to accept a name(Containing three words) and display only the initials (i.e., first letter of each word).
import java.util.Scanner;

public class Initials {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting the name containing three words
        System.out.println("Enter a name containing three words:");
        String name = scanner.nextLine();

        // Extracting initials
        String[] words = name.split(" ");
        StringBuilder initials = new StringBuilder();
        for (String word : words) {
            initials.append(word.charAt(0)).append(" ");
        }

        // Displaying the initials
        System.out.println("Initials: " + initials.toString().trim());

        scanner.close();
    }

}
