package jframe;

import javax.swing.*;

public class MyClass extends JFrame {
    public MyClass(){
        super("Example GUI");
        setTitle("Hello World!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setResizable(true);
        setLocationRelativeTo(null);
        setVisible(true);

        // adding component
        JButton button = new JButton("Button");
        add(button);

        repaint();
        revalidate();
    }
}
