package DIO.ContaBanco;
import java.util.Scanner;

    public class main {
        public static void main(String[] args) {
            int condicao = 1;
            Scanner scan = new Scanner(System.in);
            while (condicao == 1) {
                System.out.print("Digite o primeiro número: ");
                double num1 = scan.nextDouble();
                scan.nextLine();

                System.out.print("Digite o segundo número: ");
                double num2 = scan.nextDouble();
                scan.nextLine();

                System.out.print("Qual operação deseja realizar +, -, *, /: ");
                String operacao = scan.nextLine();

                if (operacao.equals("+")) {
                    System.out.printf("%.2f + %.2f = %.2f", num1, num2, num1 + num2);
                } else if (operacao.equals("-")) {
                    System.out.printf("%.2f - %.2f = %.2f", num1, num2, num1 - num2);
                } else if (operacao.equals("*")) {
                    System.out.printf("%.2f * %.2f = %.2f", num1, num2, num1 * num2);
                } else if (operacao.equals("/")) {
                    if (num2 == 0) {
                        System.out.println("Não é possivel realizar divisão por 0");
                    } else {
                        System.out.printf("%.2f / %.2f = %.2f \n", num1, num2, num1 / num2);
                    }
                } else {
                    System.out.println("Escolha uma operação válida");
                }
                System.out.print("\nDeseja realizar mais alguma operação ? 0/1 ");
                condicao = scan.nextInt();
                scan.nextLine();
            }
        }
    }
