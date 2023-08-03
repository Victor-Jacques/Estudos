package MyProject;

public class Conta {
    String cliente;
    double saldo;

    void exibesaldo(){
        System.out.println(cliente + " Seu saldo é de: " + saldo + " R$");
    }
    void saque(double valor) {
        saldo -= valor;
        System.out.println("Seu novo saldo é de: " + saldo + " R$");
    }
    void deposito(double valor) {
        saldo += valor;
        System.out.println("Foi depositado um valor de "+ valor + " R$" + " Seu novo saldo é de: " + saldo + " R$");
    }
    void transferenciaValor(Conta destino, double valor) {
        this.saque(valor);
        destino.deposito(valor);
    }
}
