package Alura;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int randomNumber = new Random().nextInt(100);
        int tries = 0;

        while (tries < 5) {
            System.out.println("Choose a number between 0 and 100: ");
            int choosedNumber = scan.nextInt();
            tries++;

            if(choosedNumber > randomNumber){
                System.out.println("The random number is less than the one you chose");
            } else if (choosedNumber < randomNumber) {
                System.out.println("The random number is bigger than the one you chose");
            } else{
                System.out.println("Congratulations, you got it right in " + tries + " tries");
                break;
            }
        }
        if(tries == 5){
            System.out.println("Unfortunately, your attempts are over, " + randomNumber + " was the random number, try again next time!");
        }

    }
}
