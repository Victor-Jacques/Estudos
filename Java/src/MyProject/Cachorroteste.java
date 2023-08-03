package MyProject;

public class Cachorroteste {
    public static void main (String[] args){
        Cachorro beagle = new Cachorro();
        beagle.raça = "Beagle";
        beagle.tamanho = 40;
        beagle.latir();

        System.out.println(beagle.tamanho);
    }
}
