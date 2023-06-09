import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //-Define a testing class with a main() method where you:
        // -Define an array of strings called carBrands that is populated with 5 famous car brand names
        String[] carBrands = new String[]{"Tesla", "Audi", "BMW", "Mercedes-Benz", "Opel"};
        //Print in console the number of items of the carBrands array
        System.out.println(carBrands.length);
        //Print in console the 3rd item of carBrands array
        System.out.println(carBrands[2]);
        // -Declare an empty array of integers called primeNumbers with a predefined size of 6 items
        int[] primeNumbers = new int[6];
        //Iinsert one by one the values of the first 6 prime numbers, populating primeNumbers array
        primeNumbers[0] = 2;
        primeNumbers[1] = 3;
        primeNumbers[2] = 5;
        primeNumbers[3] = 7;
        primeNumbers[4] = 11;
        primeNumbers[5] = 13;
        // -Print in console all the content of the already populated primeNumbers array
        System.out.println(Arrays.toString(primeNumbers));
        /*
        for(int i = 0; i < primeNumbers.length; i++){
            System.out.printf(primeNumbers[i]+ " ");
        }
         */
    }
}