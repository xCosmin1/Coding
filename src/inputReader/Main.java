package inputReader;


import java.util.Scanner;

/**
 * Write an application that will read the input and print back value that user provided,
 * //use try-catch statements to parse the input, e.g. I/O:
 * //Input: 10
 * //Output: int -> 10
 * //Input: 10.0
 * //Output: double -> 10.0
 * //Input: „Hello!”
 * //Output: „Hey! That’s not a value! Try once more.”
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Introduceti numarul: ");
            try {
                if (sc.hasNextInt()) {
                    System.out.println("int -> " + sc.nextInt());
                } else if (sc.hasNextDouble()) {
                    System.out.println("double -> " + sc.nextDouble());
                } else {
                    throw new Exception("Hey! That's not a value! Try once more.");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }
    }
}


