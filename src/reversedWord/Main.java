package reversedWord;

import java.util.Scanner;

/**
 * Write a Java program to reverse a word.
 * Sample Output:
 * <p>
 * Input a word: dsaf
 * Reverse word: fasd
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti cuvantul ");
        String word = sc.nextLine();
        String result = reverseWord(word);
        System.out.println(result);

    }
    public static String reverseWord(String word){
        StringBuilder reversedWord = new StringBuilder();
        for(int i = word.length()-1; i>=  0; i--){
            reversedWord.append(word.charAt(i));
        }
        return reversedWord.toString();
    }
       /* Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        StringBuilder dsef = new StringBuilder(word);
        System.out.println(dsef.reverse());*/
    }
}
