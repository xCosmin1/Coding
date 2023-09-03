package addNumberToArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
      /*  int[] array = {9, 9, 9, 9};

        int[] result = addOne(array);

        System.out.println("First array: " + Arrays.toString(array));
        System.out.println("New array: " + Arrays.toString(result));
    }

    public static int[] addOne(int[] array) {
        int n = array.length;
        for (int i = n - 1; i >= 0; i--) {
            if (array[i] < 9) {
                array[i]++;
                return array;
            }
        }
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;*/

        int[] array1 = {9,9,9,9};
        String result = "";

        for(int i = 0; i<array1.length; i++){

            result +=array1[i];
        }

        int nr = Integer.parseInt(result);
        nr++;
        result = String.valueOf(nr);
        array1 = new int[result.length()];
        for(int i = 0; i<result.length(); i++){

           /* array1[i]= Integer.parseInt(String.valueOf(result.charAt(i)));*/
            array1[i]=Integer.parseInt(result.substring(i, i+1));
            System.out.println(array1[i]);
        }


    }
}





