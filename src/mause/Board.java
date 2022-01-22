package mause;

import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {

    private Model model;
    private int cellNimber;

    public Board(){
        this.setBackground(Color.LIGHT_GRAY);

        cellNimber = 8;

        model = new Model(0,0,
                getWidth()/cellNimber,
                getHeight()/cellNimber,
                cellNimber);

        this.addKeyListener(new Controller(model));
    }
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        int width = this.getWidth()/cellNimber;
        int height = this.getHeight()/cellNimber;

        model.setWidht(width);
        model.setHeight(height);

        int x = 0;
        int y = 0;

        for (int row = 0; row <cellNimber; row++) {
            for (int col = 0; col <cellNimber ; col++) {
                Color color;
                if(row % 2 == 0) {
                    color = (col % 2 == 0) ? Color.BLACK : Color.WHITE;
                }else {
                    color = (col % 2 == 0) ? Color.WHITE : Color.BLACK;
                }
                g.setColor(color);
                g.fillRect(x,y,width,height);
            }
            x = 0;
            y += height;
        }

        g.setColor(Color.RED);
        g.fillOval(model.getX(),model.getY(),model.getWidht(),model.getHeight());
    }
}
