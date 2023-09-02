package textCount;

import java.util.Scanner;

/**Write a Java program to count letters, spaces, numbers and other characters in an input string.
 The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
 letter: 23
 space: 9
 number: 10
 other: 6
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti textul: ");
        String text = sc.nextLine();

        int letters = 0;
        int spaces = 0;
        int numbers = 0;
        int others = 0;

        for(int i = 0; i< text.length(); i++){
            char c = text.charAt(i);
            if(Character.isLetter(c)){
                letters++;
            }else if(Character.isDigit(c)){
                numbers++;
            } else if (Character.isSpaceChar(c)) {
                spaces++;
            }else{
                others++;
            }

        }
        System.out.println("letters: " + letters);
        System.out.println("spaces: " +spaces);
        System.out.println("numbers:" +numbers);
        System.out.println("others: " +others);



    }
}
