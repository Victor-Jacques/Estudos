package Alura.buscaCEP;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ConsultaCEP consutalCep = new ConsultaCEP();

        System.out.println("Digite o número do CEP que deseja consultar: ");
        var cep = scan.nextLine();

        try {
            Endereco novoEndereco = consutalCep.buscaEndereco(cep);
            System.out.println(novoEndereco);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.salvaJson(novoEndereco);
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando aplicação");
        }
    }
}
