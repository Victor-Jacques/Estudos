package Studies;

import java.util.Scanner;

public class Datas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter first your name and then your age:");
        String name = scan.nextLine();
        int age = scan.nextInt();
        System.out.println("Hello " + name + " Nice to meet you, I see that you're " + age + " years old");

    }
}
