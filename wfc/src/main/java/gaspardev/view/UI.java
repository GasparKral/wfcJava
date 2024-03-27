package gaspardev.view;

import java.awt.*;
import javax.swing.*;

public class UI extends JFrame {

    private static final int h = 500;
    private static final int w = 700;

    public UI() {
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MenuInicial menuicial = new MenuInicial(h, w);
        menuicial.setBounds(0, 0, w, h);
        add(menuicial);
    }

    public static void main(String[] args) {

        UI interfaz = new UI();
        interfaz.setBounds(0, 0, w, h);
        interfaz.setResizable(true);
        interfaz.setBackground(Color.white);
        interfaz.setLocationRelativeTo(null);
        interfaz.setVisible(true);
    }

}
