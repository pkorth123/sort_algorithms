package comparesorts;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Patrick Korth with assistance from www.stackoverflow.com
 */
public class CompareSorts {

    /**
     *
     * @param n -- size of array to be generated
     * @return a size n array with values in increasing order
     */
    public static Integer[] generateIncreasing(int n) {
        Integer[] result = new Integer[n];
        for (int i = 0; i < n; i++) {
            result[i] = i;
        }
        return result;

    }//generateAscending 

    /**
     *
     * @param n -- size of array to be generated
     * @return a size n array with values in decreasing order
     */
    public static Integer[] generateDecreasing(int n) {

        Integer[] result = new Integer[n];
        for (int i = 0; i < n; i++) {
            result[i] = i;
        }
        Collections.reverse(Arrays.asList(result));
        return result;
    }//End generateDescending 

    /**
     *
     * @param n -- size of array to be generated
     * @return a size n array with values in random order
     */
    public static Integer[] generateRandom(int n) {
        Integer[] result = new Integer[n];
        for (int i = 0; i < n; i++) {
            result[i] = i;
        }
        int index;
        Random random = new Random();
        for (int i = n - 1; i > 0; i--) {
            index = random.nextInt(i + 1);
            if (index != i) {
                result[index] ^= result[i];
                result[i] ^= result[index];
                result[index] ^= result[i];
            }
        }

        return result;
    }//End generateRandom

    /**
     *
     * @param n -- size of array to be generated
     * @return a size n array with values in order in the worse case for this
     * implementation of quicksort
     */
    public static Integer[] generateWorseCaseQuicksort(int n) {
        Integer[] result = new Integer[n];
        for (int i = 0; i < n; i++) {
            result[i] = 1;
                
            }

        return result;
    }//worst case for quickSort

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a range for n (array size): ");
        Integer arrayMin = scan.nextInt();
        Integer arrayMax = scan.nextInt();
        System.out.println();
        System.out.print("Please enter an increment value by which n is increasing: ");
        Integer incSize = scan.nextInt();
        System.out.println("Arrangement by type for array: ");
        System.out.println("      1:increasing  2:decreasing  3(default):random  4:worse case Quicksort");
        System.out.print("      Please enter an order type for the array: ");
        Integer arrayType = scan.nextInt();
        System.out.println();

        Integer arrayCurrent = arrayMin;

        for (int i = 0; i <= ((arrayMax - arrayMin) / incSize); i++) {

            //If user enters "1"
            if (arrayType == 1) {

                System.out.print(arrayCurrent + ", ");

                int startTime;
                int endTime;

                Integer arrayTest[] = CompareSorts.generateIncreasing(arrayCurrent);
                Integer arrayTemp[] = arrayTest;

                startTime = (int) System.currentTimeMillis();
                Sorts.bubbleSort(arrayTemp);
                endTime = (int) System.currentTimeMillis();
                System.out.print((endTime - startTime) + ", ");
                arrayTemp = arrayTest;
                startTime = 0;
                endTime = 0;

                startTime = (int) System.currentTimeMillis();
                Sorts.selectionSort(arrayTemp);
                endTime = (int) System.currentTimeMillis();
                System.out.print((endTime - startTime) + ", ");
                arrayTemp = arrayTest;
                startTime = 0;
                endTime = 0;
                
                startTime = (int) System.currentTimeMillis();
                Sorts.insertionSort(arrayTemp);
                endTime = (int) System.currentTimeMillis();
                System.out.print((endTime - startTime) + ", ");
                arrayTemp = arrayTest;
                startTime = 0;
                endTime = 0;
                
                startTime = (int) System.currentTimeMillis();
                Sorts.quickSort(arrayTemp);
                endTime = (int) System.currentTimeMillis();
                System.out.print((endTime - startTime) + ", ");
                arrayTemp = arrayTest;
                startTime = 0;
                endTime = 0;
                
                startTime = (int) System.currentTimeMillis();
                Sorts.mergeSort(arrayTemp);
                endTime = (int) System.currentTimeMillis();
                System.out.println(endTime - startTime);

                arrayCurrent += incSize;
            }//end if "1" is selected

            if (arrayType == 2) {

                System.out.print(arrayCurrent + ", ");

                int startTime;
                int endTime;

                Integer arrayTest[] = CompareSorts.generateDecreasing(arrayCurrent);
                Integer arrayTemp[] = arrayTest;

                startTime = (int) System.currentTimeMillis();
                Sorts.bubbleSort(arrayTemp);
                endTime = (int) System.currentTimeMillis();
                System.out.print((endTime - startTime) + ", ");
                arrayTemp = arrayTest;
                startTime = 0;
                endTime = 0;
                
                startTime = (int) System.currentTimeMillis();
                Sorts.selectionSort(arrayTemp);
                endTime = (int) System.currentTimeMillis();
                System.out.print((endTime - startTime) + ", ");
                arrayTemp = arrayTest;
                startTime = 0;
                endTime = 0;
                
                startTime = (int) System.currentTimeMillis();
                Sorts.insertionSort(arrayTemp);
                endTime = (int) System.currentTimeMillis();
                System.out.print((endTime - startTime) + ", ");
                arrayTemp = arrayTest;
                startTime = 0;
                endTime = 0;
                
                startTime = (int) System.currentTimeMillis();
                Sorts.quickSort(arrayTemp);
                endTime = (int) System.currentTimeMillis();
                System.out.print((endTime - startTime) + ", ");
                arrayTemp = arrayTest;
                startTime = 0;
                endTime = 0;
                
                startTime = (int) System.currentTimeMillis();
                Sorts.mergeSort(arrayTemp);
                endTime = (int) System.currentTimeMillis();
                System.out.println(endTime - startTime);

                arrayCurrent += incSize;
            }

            if (arrayType == 3) {

                System.out.print(arrayCurrent + ", ");

                int startTime;
                int endTime;

                Integer arrayTest[] = CompareSorts.generateRandom(arrayCurrent);
                Integer arrayTemp[] = arrayTest;

                startTime = (int) System.currentTimeMillis();
                Sorts.bubbleSort(arrayTemp);
                endTime = (int) System.currentTimeMillis();
                System.out.print((endTime - startTime) + ", ");
                arrayTemp = arrayTest;
                startTime = 0;
                endTime = 0;
                
                startTime = (int) System.currentTimeMillis();
                Sorts.selectionSort(arrayTemp);
                endTime = (int) System.currentTimeMillis();
                System.out.print((endTime - startTime) + ", ");
                arrayTemp = arrayTest;
                startTime = 0;
                endTime = 0;
                
                startTime = (int) System.currentTimeMillis();
                Sorts.insertionSort(arrayTemp);
                endTime = (int) System.currentTimeMillis();
                System.out.print((endTime - startTime) + ", ");
                arrayTemp = arrayTest;
                startTime = 0;
                endTime = 0;
                
                startTime = (int) System.currentTimeMillis();
                Sorts.quickSort(arrayTemp);
                endTime = (int) System.currentTimeMillis();
                System.out.print((endTime - startTime) + ", ");
                arrayTemp = arrayTest;
                startTime = 0;
                endTime = 0;
                
                startTime = (int) System.currentTimeMillis();
                Sorts.mergeSort(arrayTemp);
                endTime = (int) System.currentTimeMillis();
                System.out.println(endTime - startTime);

                arrayCurrent += incSize;
            }
            if (arrayType == 4) {

                System.out.print(arrayCurrent + ", ");

                int startTime;
                int endTime;

                Integer arrayTest[] = CompareSorts.generateWorseCaseQuicksort(arrayCurrent);
                Integer arrayTemp[] = arrayTest;

                startTime = (int) System.currentTimeMillis();
                Sorts.bubbleSort(arrayTemp);
                endTime = (int) System.currentTimeMillis();
                System.out.print((endTime - startTime) + ", ");
                arrayTemp = arrayTest;
                startTime = 0;
                endTime = 0;
                
                startTime = (int) System.currentTimeMillis();
                Sorts.selectionSort(arrayTemp);
                endTime = (int) System.currentTimeMillis();
                System.out.print((endTime - startTime) + ", ");
                arrayTemp = arrayTest;
                startTime = 0;
                endTime = 0;
                
                startTime = (int) System.currentTimeMillis();
                Sorts.insertionSort(arrayTemp);
                endTime = (int) System.currentTimeMillis();
                System.out.print((endTime - startTime) + ", ");
                arrayTemp = arrayTest;
                startTime = 0;
                endTime = 0;
                
                startTime = (int) System.currentTimeMillis();
                Sorts.quickSort(arrayTemp);
                endTime = (int) System.currentTimeMillis();
                System.out.print((endTime - startTime) + ", ");
                arrayTemp = arrayTest;
                startTime = 0;
                endTime = 0;
                
                startTime = (int) System.currentTimeMillis();
                Sorts.mergeSort(arrayTemp);
                endTime = (int) System.currentTimeMillis();
                System.out.println(endTime - startTime);

                arrayCurrent += incSize;
            }
        }

    }//main

}//CompareSorts
