package Alura;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String cliente1 = "Joana Jackson";
        String tipoDeConta = "Corrente";
        double saldoCliente1 = 2500;

        System.out.println("************************");
        System.out.println("Dados iniciais do cliente: \n");
        System.out.println("Nome: " + cliente1);
        System.out.println("Tipo de conta: " + tipoDeConta);
        System.out.printf("Saldo inicial: R$ %.2f \n", saldoCliente1);
        System.out.println("************************");



            while (operacoes != 4) {

                switch (operacoes) {
                    case 1:
                        System.out.printf("O saldo da conta é R$ %.2f", saldoCliente1);

                    case 2:
                        System.out.println("Insira a quantia que irá receber: ");
                        double quantiaReceber = scan.nextInt();
                        double saldoNovo = quantiaReceber + saldoCliente1;
                        System.out.printf("Seu novo saldo é: R$ %.2f", saldoNovo);
                }

        }
    }
}
