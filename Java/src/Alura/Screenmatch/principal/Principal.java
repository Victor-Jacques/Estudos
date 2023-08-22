package Alura.Screenmatch.principal;
import Alura.Screenmatch.calculos.CalculadoraDeTempo;
import Alura.Screenmatch.calculos.FiltroRecomendacao;
import Alura.Screenmatch.modelos.Episodio;
import Alura.Screenmatch.modelos.Filme;
import Alura.Screenmatch.modelos.Serie;
import Alura.Screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie("Lost", 2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodios(50);
        System.out.println("Duração da serie: "+ lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.setDuracaoEmMinutos(200);

//        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
//        calculadora.inclui(meuFilme);
//        calculadora.inclui(outroFilme);
//        calculadora.inclui(lost);
//        System.out.println(calculadora.getTempoTotal());

//        FiltroRecomendacao filtro = new FiltroRecomendacao();
//        filtro.filtra(meuFilme);

//        Episodio episodio = new Episodio();
//        episodio.setNumero(1);
//        episodio.setSerie(lost);
//        episodio.setTotalVizualizacoes(300);
//        filtro.filtra(episodio);

        var terceiroFilme = new Filme("Dogville", 2003);
        //terceiroFilme.setNome("Dogville");
        terceiroFilme.setDuracaoEmMinutos(200);
        terceiroFilme.avalia(10);

        ArrayList <Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(terceiroFilme);
        System.out.println(listaDeFilmes.size());
        System.out.println(listaDeFilmes.get(0).getNome());
        for (int i = 0; i < listaDeFilmes.size(); i++) {
            System.out.println(listaDeFilmes.get(i).getNome());
        }
        System.out.println("toString do filme: " + listaDeFilmes.get(0).toString());
        Object objeto = terceiroFilme;
    }
}
