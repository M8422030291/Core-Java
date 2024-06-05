//Write a program for converting a sentence in reverse. (Input: BASIC IS PROGRAMMING     Output: PROGRAMMING IS BASIC)

import java.util.Scanner;

public class ReversedSentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String reversedSentence = reverseSentence(sentence);
        System.out.println("Reversed sentence: " + reversedSentence);
    }

    private static String reverseSentence(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split("\\s+");
        StringBuilder reversedSentence = new StringBuilder();

        // Append words in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]);
            if (i > 0) {
                reversedSentence.append(" ");
            }
        }

        return reversedSentence.toString();
    }
}
