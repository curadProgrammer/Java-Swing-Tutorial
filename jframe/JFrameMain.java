package jframe;

import javax.swing.*;

public class JFrameMain {
    public static void main(String[] args) {
        JFrame window = new JFrame("Example GUI");
        window.setTitle("Hello World!");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400, 400);
        window.setResizable(true);
        window.setLocationRelativeTo(null);
        window.setVisible(true);

        // adding component
        JButton button = new JButton("Button");
        window.add(button);

        window.repaint();
        window.revalidate();
    }
}
