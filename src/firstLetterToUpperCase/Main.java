package firstLetterToUpperCase;

import java.util.Scanner;

/**
 * Write a Java program to capitalize the first letter of each word in a sentence.
 * Sample Output:
 * Input a Sentence: the quick brown fox jumps over the lazy dog.
 * The Quick Brown Fox Jumps Over The Lazy Dog.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduceti textul: ");

        String text = sc.nextLine();

        String[] words = text.split(" ");

        for (int i = 0; i < words.length; i++) {

            String firstLetter = words[i].substring(0, 1);
            String restOfWord = words[i].substring(1);

            firstLetter = firstLetter.toUpperCase();
            words[i] = firstLetter + restOfWord;
        }

        String capitalizedSentence = String.join(" ", words);
        System.out.println("Capitalized sentence: " + capitalizedSentence);

/*
        Scanner sc = new Scanner(System.in);
        String text;
        System.out.print("Input a sentence: ");
        text = sc.nextLine();
        System.out.print("The result is: ");
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.print(capitalizeFirstLetter(words[i]) + " ");
        }
    }

    public static String capitalizeFirstLetter(String text) {
        return text.substring(0, 1).toUpperCase() + text.substring(1);
    }
}*/
    }
}
