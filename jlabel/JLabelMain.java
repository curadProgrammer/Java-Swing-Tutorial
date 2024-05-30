package jlabel;

import javax.swing.*;
import java.awt.*;
import java.util.Locale;

public class JLabelMain {
    public static void main(String[] args) {
        JFrame window = new JFrame("Window");
        window.setSize(500, 400);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello World!");
        window.add(label);

        ImageIcon imageIcon = new ImageIcon("src/resources/earth.png");
//        label.setIcon(imageIcon);

        // change the text after declaring initial text
//        label.setText("BOTTOM");


        label.setText("ITALIC");
        label.setFont(new Font("Dialog", Font.ITALIC, 48));

        // setting text position relative to label
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.CENTER);

        // changing color
//        label.setForeground(Color.WHITE);
//        label.setForeground(Color.decode("#ba523f"));
//        label.setForeground(new Color(58, 240, 67, 200));

        // retrieve text
//        System.out.println(label.getText());

        // vertical alignment
//        label.setVerticalAlignment(SwingConstants.BOTTOM);

        // horizontal alignment
        label.setHorizontalAlignment(SwingConstants.CENTER);

        // setting font
//        label.setFont(new Font("Cambria", Font.BOLD, 72));

        // visibility
//        label.setVisible(true);

//        String html = "<html>" +
//                "<ul>" +
//                "<li>List #1</li>" +
//                "<li>List #1</li>" +
//                "<li>List #1</li>" +
//                "<li>List #1</li>" +
//                "</ul>" +
//                "</html>";
//        label.setText(html);

//        window.getContentPane().setBackground(Color.BLUE);
        window.setVisible(true);
    }

    private static void printFonts(){
        GraphicsEnvironment ge = GraphicsEnvironment
                .getLocalGraphicsEnvironment();

        Font[] allFonts = ge.getAllFonts();

        for (Font font : allFonts) {
            System.out.println(font.getFontName(Locale.US));
        }
    }
}
