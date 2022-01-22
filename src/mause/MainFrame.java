package mause;

import javax.swing.*;

public class MainFrame extends JFrame {

    public MainFrame(){

        Board board = new Board();

        board.setFocusable(true);
        board.requestFocus();

        this.add(board);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Chessboard");
        this.setSize(450,450);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }
}
