package mause;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Controller implements KeyListener {
    public Controller(Model model) {
    }

    private Model model;
    private JPanel targetPanel;

    public Controller(JPanel targetPanel, Model model){
        this.model = model;
        this.targetPanel = targetPanel;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                model.moveLeft();
                break;
            case KeyEvent.VK_UP:
                model.moveUp();
                break;
            case KeyEvent.VK_RIGHT:
                model.moveRight();
                break;
            case KeyEvent.VK_DOWN:
                model.moveDown();
                break;
        }
        targetPanel.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("\nKeyReleased");
        System.out.println("KeyCode: " + e.getKeyCode());
        System.out.println("KeyChar: " + e.getKeyChar());
        System.out.println("ExtendetKeyCode: " + e.getExtendedKeyCode());
        System.out.println("KeyLocation: " + e.getKeyLocation());
    }
}
