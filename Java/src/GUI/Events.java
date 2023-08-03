package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Events extends JFrame implements ActionListener {
    public Events(){
        super ("Meus eventos");

        JButton botao = new JButton("Clique");
        botao.addActionListener(this);

        getContentPane().add(botao);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setVisible(true);
    }
    public static void main (String [] agrs) {
        new Events();
    }
    public void actionPerformed(ActionEvent e) {
        System.out.println("Você clicou no botão!");
    }
}
