import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scan.nextDouble();
        scan.nextLine();

        System.out.print("Enter the second number: ");
        double num2 = scan.nextDouble();
        scan.nextLine();

        System.out.print("Which operation do you want to perform: ");
        String operation = scan.nextLine();

        //case "sum": ...break == case "sum" ->   has a break after each case.

        switch (operation) {
            case "sum" -> System.out.printf("%.2f + %.2f = %.2f", num1, num2, num1 + num2);
            case "sub" -> System.out.printf("%.2f - %.2f = %.2f", num1, num2, num1 - num2);
            case "mult" -> System.out.printf("%.2f * %.2f = %.2f", num1, num2, num1 * num2);
            case "div" -> {
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero.");
                } else {
                    System.out.printf("%.2f / %.2f = %.2f", num1, num2, num1 / num2);
                }
            }
            default -> System.out.println("Is not a supported operation.");
        }
    }
}
