import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final int ARRAY_SIZE = 10;


        int[] array = new int[ARRAY_SIZE];
        int checker = 0;
        try (Scanner input = new Scanner(System.in)) {

            while (checker < 10) {
                try {
                    System.out.println("Write integer number different than 0");
                    int number = input.nextInt();
                    if (number != 0) {
                        array[checker] = number;
                        checker++;

                    } else {
                        System.out.println("The number is 0, please write proper number");

                    }
                } catch (InputMismatchException e) {
                    System.out.println("Number isnt integer. Please write number again");
                    input.nextLine();
                }
            }
        }

        int mainArraySum = 0;
        for (int tmp : array) {
            mainArraySum += tmp;
        }
        System.out.println("Numbers sum of main array " + mainArraySum);

        int uniqueNumbersCount = 0;

        for (int tmp : array) {
            if (howManyTimes(array, tmp) == 1) {
                uniqueNumbersCount++;
            }
        }

        int[] uniqueNumbersSummary = new int[uniqueNumbersCount];


        int counter = 0;
        for (int tmp : array) {
            if (howManyTimes(array, tmp) == 1) {
                uniqueNumbersSummary[counter] = tmp;
                counter++;
            }
        }

        int sum = 0;
        for (int tmp : uniqueNumbersSummary) {
            sum += tmp;
        }
        System.out.println("Sum of unique numbers in array " + sum);


    }

    static int howManyTimes(int[] array, int number) {

        int count = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] == number) {
                count++;
            }
        }
        return count;

    }
}
