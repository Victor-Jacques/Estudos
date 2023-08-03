import java.util.Scanner;
import java.sql.SQLException;
public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scan.nextDouble();
        scan.nextLine();

        System.out.print("Enter the second number: ");
        double num2 = scan.nextDouble();
        scan.nextLine();

        System.out.print("What operation do you want to perform: ");
        String operation = scan.nextLine();

        switch(operation){
            case "sum":
                System.out.printf("%f + %f = %f", num1, num2, num1 + num2);
                break;
            case "sub":
                System.out.printf("%f - %f = %f", num1, num2, num1 - num2);
                break;
            case "mult":
                System.out.printf("%f * %f = %f", num1, num2, num1 * num2);
                break;
            case "div":
                if(num2 == 0){
                    System.out.println("Cannot divide by zero.");
                } else {
                    System.out.printf("%f / %f = %f", num1, num2, num1 / num2);
                }
                break;
            default:
                System.out.println("Is not a supported operation.");
        }
    }
}
