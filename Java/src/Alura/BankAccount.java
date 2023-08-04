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


        System.out.println(" Operações \n");
        System.out.println("1- Consultar saldos");
        System.out.println("2- Receber valor");
        System.out.println("3- Transferir valor");
        System.out.println("4- Sair \n");
        System.out.println("Digite a opção desejada: ");
        int operacoes = scan.nextInt();

            while (operacoes != 4) {

                if (operacoes == 1) {
                    System.out.printf("O saldo da conta é: R$ %.2f", saldoCliente1);
                    break;
                } else if (operacoes == 2) {
                    System.out.printf("Qual valor à receber ? ");
                    double recebeValor = scan.nextInt();
                    double novoSaldo = recebeValor + saldoCliente1;
                    System.out.printf("Novo saldo é de: R$ %.2f", novoSaldo);
                    break;
                }
            }
        }
    }
