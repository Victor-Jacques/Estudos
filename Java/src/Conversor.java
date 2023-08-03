import java.util.Scanner;

public class Conversor {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("How much BRL do you want to convert ?");
        double BRL = scan.nextDouble();
        scan.nextLine();

        System.out.printf("This quantity of BRL's %f is worth %f Dolars", BRL, BRL * 0.21);

    }
}
