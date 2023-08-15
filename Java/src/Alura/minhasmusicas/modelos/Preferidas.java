package Alura.minhasmusicas.modelos;

public class Preferidas {
    public void inclui (Audio audio) {
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " É considerado um sucesso.");
        } else {
            System.out.println(audio.getTitulo() + " Muito curtido recentemente.");
        }
    }
}
