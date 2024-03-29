package gaspardev.model;

import java.awt.*;

import gaspardev.controller.WaveFuntionColapse;

public class Map extends Canvas {

    private static WaveFuntionColapse wfc;
    int width, height, rows, columns;

    public Map(int w, int h, int r, int c) {
        setSize(width = w, height = h);
        rows = r;
        columns = c;
    }

    @Override
    public void paint(Graphics g) {
        int k;
        width = getSize().width;
        height = getSize().height;

        int htOfRow = height / (rows);
        for (k = 0; k < rows; k++) {
            g.drawLine(0, k * htOfRow, width, k * htOfRow);
        }

        int wdOfRow = width / (columns);
        for (k = 0; k < columns; k++) {
            g.drawLine(k * wdOfRow, 0, k * wdOfRow, height);
        }
    }
}
