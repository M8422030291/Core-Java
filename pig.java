/1.In Piglatin a word such as KING becomes INGKAY, TROUBLE becomes OUBLETRAY as so on. The first vowel of the original word becomes the starting of the translation and proceeding letter being shifted towards the end and followed by AY. Word that begins with a vowel is left unchanged. WAP to accept a word and convert in to Piglatin word.(interview)

import java.util.Scanner;

public class Pig {
    public static void main(String[] args) {

String str="KING";//assign variable
 int p = 0,i;
for (i = 0; i<str.length(); i++){
    char ch=str.charAt(i);
    if (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='O')//vowels
        break;
}
if (i==0) {
    System.out.println(str);//
}
else
    System.out.println("Piglatin word : "+str.substring(i)+str.substring(0,i)+"AY");//substring(i) indicate is a vowel substring(0,i)=> indicates that a last word to add AY
  }
}
