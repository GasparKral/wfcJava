package gaspardev.view;

import javax.swing.*;
import gaspardev.model.UIPane;
import java.awt.event.*;

public class NuevoMapa extends UIPane {

    private JLabel altura, anchura;
    private JTextField alt, anch;
    private JButton crear;

    public NuevoMapa(int h, int w) {
        super(h, w);
        altura = new JLabel("Altura: ");
        add(altura);

        alt = new JTextField("50");
        alt.setBounds(10, 30, 100, 20);
        add(alt);

        anchura = new JLabel("Anchura: ");
        anchura.setBounds(10, 60, 100, 20);
        add(anchura);

        anch = new JTextField("50");
        anch.setBounds(10, 80, 100, 20);
        add(anch);

        crear = new JButton("Crear");
        crear.setBounds(10, 110, 100, 20);
        add(crear);
    }

    public static void main(String[] args) {

        NuevoMapa nuevoMapa = new NuevoMapa(500, 700);
        nuevoMapa.setBounds(0, 0, 700, 500);
        nuevoMapa.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        this.setVisible(false);
        if (e.getSource() == crear) {

        }

    }
}
