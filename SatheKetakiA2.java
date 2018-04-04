import java.util.Arrays;

public class SatheKetakiA2 {

    /*Create a java class LastnameFirstnameA2.java to store an integer array and a number.
    The output would be all the pairs of integers from the array which add up to that number.
    */

    public static void main(String[] args) {
        int[] numArray = {3, 5, 0, 7, 11, -1, -9, 4, 10, -8, 18};
        int num = 10;

        System.out.println("Array = " + Arrays.toString(numArray));
        System.out.println("No_of_elements = " + numArray.length);
        System.out.println("Sum = " + num);

        for (int i = 0; i <= numArray.length - 1; i++) {

            // j = i+1 to avoid duplicate pairs visited by i before

            for (int j = i + 1; j <= numArray.length - 1; j++) {
                if (num - numArray[i] == numArray[j]) {
                    System.out.println("(" + numArray[i] + ", " + numArray[j] + ")");
                }
            }
        }
    }
}



