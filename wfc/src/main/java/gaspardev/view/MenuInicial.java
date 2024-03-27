package gaspardev.view;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import gaspardev.model.UIPane;

public class MenuInicial extends UIPane {

    private JTextArea menuObj;
    private JButton btn1, btn2, btn3;

    private String menu = "Bienvenido al programa de generación de mapas procedurales de WFC\n" +
            "Seleccione una de las siguientes opciones: \n\n";

    private String op1 = "Cargar un nuevo patrones \n", op2 = "Cargar nuevas conexciones \n",
            op3 = "Generar un nuevo mapa \n";

    public MenuInicial(int h, int w) {

        super(h, w);
        setLayout(null);
        menuObj = new JTextArea(menu);
        menuObj.setBounds(0, 0, 700, 100);
        menuObj.setFont(new Font("Roboto", Font.BOLD, getREM()));
        menuObj.setMargin(new Insets(getREM(), getREM(), 10, 10));
        menuObj.setEditable(false);
        add(menuObj);

        btn1 = new JButton(op1);
        btn1.setBounds(getREM(), 150, 200, 50);
        btn1.addActionListener(this);
        add(btn1);

        btn2 = new JButton(op2);
        btn2.setBounds(200 + 2 * getREM(), 150, 200, 50);
        btn2.addActionListener(this);
        add(btn2);

        btn3 = new JButton(op3);
        btn3.setBounds(400 + 3 * getREM(), 150, 200, 50);
        btn3.addActionListener(this);
        add(btn3);

    }

    public void actionPerformed(ActionEvent e) {

        this.setVisible(false);
        if (e.getSource() == btn3) {
            NuevoMapa nuevoMapa = new NuevoMapa(getWidth(), getHeight());
            nuevoMapa.setBounds(0, 0, getWidth(), getHeight());
        }
        if (e.getSource() == btn1) {
            CargarNuevosPatrones newPatrones = new CargarNuevosPatrones(getWidth(), getHeight());
            newPatrones.setBounds(0, 0, getWidth(), getHeight());
        }

    }

}