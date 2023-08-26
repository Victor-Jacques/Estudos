package Alura.Screenmatch.modelos;

import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {
        @SerializedName("Title")
        private String nome;
        @SerializedName("Year")
        private int anoDeLancamento;
        private boolean incluidoNoPlano;
        private double somaDasAvaliacoes;
        private int totalDeAvaliacoes;
        private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();
        this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0, 2));
    }

    public String getNome() {
            return nome;
        }

        public int getAnoDeLancamento() {
            return anoDeLancamento;
        }

        public boolean getIncluidoNoPlano() {
            return incluidoNoPlano;
        }

        public int getDuracaoEmMinutos() {
            return duracaoEmMinutos;
        }

        public int getTotalDeAvaliacoes () {
            return totalDeAvaliacoes;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setIncluidoNoPlano(boolean incluidoNoPlano) {
            this.incluidoNoPlano = incluidoNoPlano;
        }

        public void setDuracaoEmMinutos(int duracaoEmMinutos) {
            this.duracaoEmMinutos = duracaoEmMinutos;
        }

        public void setAnoDeLancamento(int anoDeLancamento) {
            this.anoDeLancamento = anoDeLancamento;
        }

        public void exibeFichaTecnica () {
            System.out.println("Nome: " + nome);
            System.out.println("Ano de lançamento: " + anoDeLancamento);
            System.out.println("O filme tem uma duração de: " + duracaoEmMinutos + " minutos");
        }

        public void avalia (double nota) {
            somaDasAvaliacoes += nota;
            totalDeAvaliacoes++;
        }

        public double pegaMedia () {
            return somaDasAvaliacoes / totalDeAvaliacoes;
        }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "Nome: " + nome  +
                ", Ano de lançamento: " + anoDeLancamento +
                ", Duração em minutos: " + duracaoEmMinutos;
    }
}

