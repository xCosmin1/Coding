package largestNumber;

/**
 * Write a Java program to get the largest value between the first and last elements of an array (length 3) of integers.
 * Sample Output:
 */
public class Main {
    public static void main(String[] args) {
        /*Integer array[]= {10, 50, 30};
        int firstNumber = array[0];
        int lastNumber = array[2];
        System.out.println("The largest value is: " + Math.max(firstNumber, lastNumber));
*/
        /*int[] array = {20, 30, 40};
        int max = array[0];
        for (int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println("The highest value in the array is: " + max + ".");*/

        int[] array = {20, 30, 40, 50};
        int lenghtOfArray = array.length;
        int maxValue;
        if (lenghtOfArray > 0) {
            maxValue = array[0];
            for (int i = 1; i < lenghtOfArray; i++) {
                if (array[i] > maxValue) {
                    maxValue = array[i];
                }
            }
            System.out.println("Maxim: " + maxValue);
        } else {
            System.out.println("The array has not any value.");
        }
    }
}
