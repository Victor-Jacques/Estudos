package Alura.minhasmusicas;

import Alura.minhasmusicas.modelos.Audio;
import Alura.minhasmusicas.modelos.Musica;
import Alura.minhasmusicas.modelos.Podcast;
import Alura.minhasmusicas.modelos.Preferidas;

public class Play {
    public static void main(String[] args) {
    Audio audio = new Audio();
    Musica minhaMusica = new Musica();
    Podcast podpah = new Podcast();

    minhaMusica.setTitulo("Forever");
    minhaMusica.setCantor("Kanye west");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }
        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }


    podpah.setTitulo("Podpah");
    podpah.setApresentador("Igão underground e Mitico jovem.");

        for (int i = 0; i < 1200; i++) {
            podpah.reproduz();
        }
        for (int i = 0; i < 600; i++) {
            podpah.curte();
        }

        Preferidas preferidas = new Preferidas();
        preferidas.inclui(podpah);
        preferidas.inclui(minhaMusica);
    }
}
