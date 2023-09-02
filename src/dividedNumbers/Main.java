package dividedNumbers;

/**
 * Write a Java program to print numbers between 1 and 100 divisible by 3, 5 and both.
 * Sample Output:
 * <p>
 * Divided by 3:
 * 3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57
 * , 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99,
 * <p>
 * Divided by 5:
 * 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90,
 * 95,
 * <p>
 * Divided by 3 & 5:
 * 15, 30, 45, 60, 75, 90,
 */
public class Main {
    public static void main(String[] args) {
        /*for(int i = 1; i<101; i++){
            if(i % 3 == 0  && i % 5 ==0){
                System.out.println("Numbers divided by 3 and 5 " +i);

            }
        }
        System.out.println("----------------------------");
        for(int i = 1; i<101; i++){
            if(i % 3 == 0){
                System.out.println("Numbers divided by 3  " +i);

            }
        }
        System.out.println("------------------------");
        for(int i = 1; i<101; i++){
            if(i % 5 == 0){
                System.out.println("Numbers divided by 5 " +i);

            }
        }*/
        /*for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i + ", ");

            } else if (i % 5 == 0) {
                System.out.println(i + ", ");

            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + ", ");

            }
        }*/
        /*StringBuilder sir3 = new StringBuilder();
        StringBuilder sir5 = new StringBuilder();
        StringBuilder sir35 = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                sir3.append(i + ", ");
                if (i % 5 == 0) {
                    sir5.append(i + ", ");
                    sir35.append(i + ", ");
                }
            } else if (i % 5 == 0) {
                sir5.append(i + ", ");
            }
        }
        System.out.println("Divided by 3: " + sir3.toString());
        System.out.println("Divided by 5: " + sir5.toString());
        System.out.println("Divided by 5 & 3 & : " + si*//*r35.toString());*/
        StringBuilder divWith3 = new StringBuilder();
        divWith3.append("Divided by 3:  \n");

        StringBuilder divWith5 = new StringBuilder();
        divWith5.append("Divided by 5:  \n");

        StringBuilder divWithBoth = new StringBuilder();
        divWithBoth.append("Divided by 3 & 5:  \n");

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                divWith3.append(i + ", ");
            }

            if (i % 3 != 0 && i % 5 == 0) {
                divWith5.append(i + ", ");
            }

            if (i % 3 == 0 && i % 5 == 0) {
                divWithBoth.append(i + ", ");
            }
        }

        System.out.println(divWith3.toString());
        System.out.println(divWith5.toString());
        System.out.println(divWithBoth.toString());
    }
}



