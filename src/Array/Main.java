package Array;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    String [] carBrands = {"Ferrari", "BMW", "Jaguar", "Maserati", "Mercedes"};

    System.out.println("Famous car brand: " + Arrays.toString(carBrands));
    System.out.println("\n3rd brand: " +carBrands[2]);

    Integer [] primeNumbers = new Integer[6];
    primeNumbers[0] = 1;
    primeNumbers[1] = 3;
    primeNumbers[2] = 7;
    primeNumbers[3] = 13;
    primeNumbers[4] = 17;
    primeNumbers[5] = 19;

    System.out.println("\nPrime numbers: " + Arrays.toString(primeNumbers));


    }
}
