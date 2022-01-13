package view;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        this.setLayout(new BorderLayout());

        MainPanel mainPanel = new MainPanel();
        this.add(mainPanel, BorderLayout.CENTER);

        ControlPanel controlPanel = new ControlPanel(mainPanel);
        this.add(controlPanel, BorderLayout.SOUTH);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
