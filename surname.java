//Write a program in Java to accept a name containing three words and display the surname first, followed by the first and middle names.
import java.util.Scanner;

public class NameFormatter {
  public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Accepting the name containing three words
            System.out.println("Enter a name containing three words:");
            String name = scanner.nextLine();

            // Extracting surname and first/middle names
            String[] words = name.split(" ");
            String surname = words[0];
            StringBuilder firstNameMiddleName = new StringBuilder();
            for (int i = 1; i < words.length; i++) {
                firstNameMiddleName.append(words[i]).append(" ");
            }

            // Displaying the formatted name
            System.out.println("Formatted Name: " + firstNameMiddleName.toString().trim() + " " + surname);

            scanner.close();
        }
    }

