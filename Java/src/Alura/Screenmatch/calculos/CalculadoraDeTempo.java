package Alura.Screenmatch.calculos;

import Alura.Screenmatch.modelos.Filme;
import Alura.Screenmatch.modelos.Serie;
import Alura.Screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void inclui (Filme f) {
//        tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void inclui (Serie s) {
//        tempoTotal += s.getDuracaoEmMinutos();
//    }

    public void inclui (Titulo titulo) {
        System.out.println(titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
