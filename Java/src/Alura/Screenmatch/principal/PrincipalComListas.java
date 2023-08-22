package Alura.Screenmatch.principal;

import Alura.Screenmatch.modelos.Filme;
import Alura.Screenmatch.modelos.Serie;
import Alura.Screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        var terceiroFilme = new Filme("Dogville", 2003);
        terceiroFilme.avalia(10);
        Serie lost = new Serie("Lost", 2000);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(7);
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(terceiroFilme);
        lista.add(lost);
        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }
//        Both for's do the same thing
//        for (int i = 0; i < lista.size(); i++) {
//            System.out.println(lista.get(i));
//        }

        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento)); //.reversed()
        System.out.println(lista);

        List<String> buscaPorArtista = new LinkedList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Wesley");
        buscaPorArtista.add("Kleber");
        buscaPorArtista.add("Cleiton");

        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);

    }
}