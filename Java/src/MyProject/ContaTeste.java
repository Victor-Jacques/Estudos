package MyProject;

public class ContaTeste {
    public static void main (String[] args) {
        Conta conta = new Conta();
        conta.cliente = "Daniel";
        conta.saldo = 5000.00;
        conta.exibesaldo();
        Conta destino = new Conta();
        destino.cliente = "Carlos";
        destino.saldo = 8000.00;
        destino.exibesaldo();
        destino.transferenciaValor(conta, 4000);
    }
}
