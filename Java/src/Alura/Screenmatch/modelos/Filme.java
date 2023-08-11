package Alura.Screenmatch;

public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    int duracaoEmMinutos;

    int getTotalDeAvaliacoes () {
        return totalDeAvaliacoes;
    }

    void exibeFichaTecnica () {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("O filme tem uma duração de: " + duracaoEmMinutos + " minutos");
    }

    void avalia (double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia () {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
