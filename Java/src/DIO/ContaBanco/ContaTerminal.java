package DIO.ContaBanco;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número da sua Agência: ");
        String agencia = scan.nextLine();

        System.out.println("Digite o seu nome: ");
        String cliente = scan.nextLine();

        System.out.println("Digite o seu saldo: ");
        float saldoCliente = scan.nextFloat();

        int operacoes = 0;

        System.out.println("************************ \n");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("Nome: " + cliente);
        System.out.println("Número da agência: " + agencia);
        System.out.printf("Saldo inicial: R$ %.2f \n", saldoCliente);
        System.out.println("\n ************************");

            while (operacoes != 4) {

                System.out.println("\n   Operações");
                System.out.println("1- Consultar saldos");
                System.out.println("2- Receber valor");
                System.out.println("3- Transferir valor");
                System.out.println("4- Sair \n");
                System.out.println("Digite a opção desejada: ");
                operacoes = scan.nextInt();

                if (operacoes == 1) {
                    System.out.printf("O saldo da conta é de: R$ %.2f \n", saldoCliente);
                } else if (operacoes == 2) {
                    System.out.println("Insira o valor à receber: ");
                    float recebeValor = scan.nextFloat();
                    saldoCliente += recebeValor;
                    System.out.printf("O novo saldo da conta é de: R$ %.2f \n", saldoCliente);
                } else if (operacoes == 3) {
                    System.out.println("Insira o valor da transferência:");
                    float valorTransferencia = scan.nextFloat();
                    if (saldoCliente < valorTransferencia) {
                        System.out.println("Saldo insuficiente para efetuar a transferência.");
                    } else {
                        saldoCliente -= valorTransferencia;
                        System.out.printf("Transferência no valor de R$ %.2f efetuada com sucesso. O novo saldo da conta é de: R$ %.2f", valorTransferencia, saldoCliente);
                    }
                } else if (operacoes == 4) {
                    System.out.println("Saindo do sistema.");
                } else if (operacoes != 4) {
                    System.out.println("Opção invalida.");
                }
            }
        }
    }

