package goodpractices.cleancode;

import java.util.Scanner;

public class DRY {
    public static void main(String[] args) {

        DRY example = new DRY();
        example.addNumbersFromInput();


    }

    public void addNumbersFromInput() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu primul numar");
        int number1 = getNumberFromInput(scanner);

        System.out.println("Introdual doilea numar");
        int number2 = getNumberFromInput(scanner);

        System.out.println("Suma numerelor introduse este " + (number1 + number2));

    }

    public int getNumberFromInput(Scanner scanner) {
        int number = 0;
        try {
            number = scanner.nextInt();
        } catch (Exception exception) {
            System.out.println("Numarul introdus nu este valid");
            scanner.nextLine();
            number = getNumberFromInput(scanner);
        }
        return number;
    }
}
