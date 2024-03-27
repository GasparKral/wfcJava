package gaspardev.model;

import java.awt.event.*;
import javax.swing.JPanel;

public abstract class UIPane extends JPanel implements ActionListener {

    private final int height;
    private final int width;
    private final int rem = 16;

    public UIPane(int h, int w) {
        super();
        this.height = h;
        this.width = w;
        this.setLayout(null);
        this.setBounds(0, 0, height, width);
        this.setVisible(true);
    }

    public int getREM() {
        return rem;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public abstract void actionPerformed(ActionEvent e);

}
