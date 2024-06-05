//.Write a program to input a sentence and count number of vowels , digits , words and special characters .
import java.util.Scanner;

public class CountVolSplDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        int vol=0,digit=0,word=0,spl=0;
        System.out.println("Enter a string");
        str=sc.nextLine();
        str=" "+str;//to read the first word
        str=str.toLowerCase();
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')//check vowels
                vol++;
            if (ch>='0' && ch<='9')//check digits
                digit++;
            if (ch==' ')//to check word
                word++;
            if (!Character.isLetterOrDigit(ch)&&!Character.isWhitespace(ch))//check special character
                spl++;

        }
        System.out.println("The number Vowels are"+vol);
        System.out.println("The number Digit are"+digit);
        System.out.println("The number world are"+word);
        System.out.println("The number Special character are"+spl);


    }
}
