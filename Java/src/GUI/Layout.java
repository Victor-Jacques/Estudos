package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Container;

public class Layout extends JFrame {

    public Layout () {
        super("Meu Layout");

        Container c = getContentPane();

        c.add(BorderLayout.NORTH, new JButton("Botão norte"));
        c.add(BorderLayout.SOUTH, new JButton("Botão sul"));
        c.add(BorderLayout.CENTER, new JButton("Botão centro"));
        c.add(BorderLayout.EAST, new JButton("Botão leste"));
        c.add(BorderLayout.WEST, new JButton("Botão oeste"));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setVisible(true);
    }
    public static void main (String[] args) {
        new Layout();
    }
}
