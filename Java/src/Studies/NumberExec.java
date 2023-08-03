package Studies;

import java.util.Scanner;

public class NumberExec {

    private static boolean ehPrimo(int number) {
        for (int j = 2; j < number; j++) {
            if (number % j == 0)
                return false;
            }
            return true;
        }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose any number: ");
        int choosedNumber = scan.nextInt();
        if (ehPrimo(choosedNumber))
            System.out.println(choosedNumber + " é primo");
        else{
            System.out.println(choosedNumber + " é composto");
        }



        /*if(calculate == 1){
            System.out.println("Esse número " + choosedNumber + " é primo!");
        } else if (choosedNumber == 2) {
            System.out.println("Esse número " + choosedNumber + " é primo");
        } else {
            System.out.println("Esse número " + choosedNumber + " é composto!");
        }*/
    }
}
