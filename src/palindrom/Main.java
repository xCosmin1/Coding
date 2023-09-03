package palindrom;

import java.util.Scanner;

/**
 * Se citesc de la tastatura 2 stringuri, sa se verifice daca cel de al doilea este palindromul primului.
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti primul text: ");
        String text1 = sc.nextLine();
        System.out.println("Introduceti al doilea text: ");
        String text2 = sc.nextLine();
        String reversedText2 = "";
        for (int i = text2.length() - 1; i >= 0; i--) {
            reversedText2 += text2.charAt(i);
        }
        if (text1.equals(reversedText2)) {
            System.out.println("The second string is a palindrome of the first string.");
        } else {
            System.out.println("The second string is not a palindrome of the first string.");
        }

    }

}
