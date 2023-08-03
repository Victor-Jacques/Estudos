package GUI;

import javax.swing.JFrame;
import javax.swing.JButton;

public class MeuFrame extends JFrame {

    public MeuFrame() {

        super ("Meu Frame");

        JButton botao = new JButton("Clique");
        JFrame frame = new JFrame();

        getContentPane().add(botao);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);
    }
    public static void main (String[] args) {
        new MeuFrame();
    }
}
