import java.time.LocalDate;


class Main {
    public static void main(String[] args) {
        User user = new User("Victor Jacques", "2002-08-26");

        Book brasCubas = new Book("Memórias póstumas de Brás Cubas", "Machado de Assis", 147);
        AudioBook dracula = new AudioBook("Dracula", "Bram Stoker", 30000);
        Ebook jeeves = new Ebook("Carry on jeeves", "P.G. Wodehouse", 280, "PDF");

        System.out.println(jeeves.toString());

    }
}