import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class JButtonApp extends JFrame implements ActionListener{
    private JButton button, button2;

    public JButtonApp(){
        super("Window");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button = new JButton("Button");
        button.addActionListener(this);
        add(button);

        button2 = new JButton("Button2");
        button2.addActionListener(this);
//        add(button2, BorderLayout.EAST);

        // changing the text of the button
        button.setText("Easy");

        // adding image
        ImageIcon buttonIcon = new ImageIcon("src/resources/red-button.png");
        button.setIcon(buttonIcon);

        // change image when pressed
        ImageIcon explosionIcon = new ImageIcon("src/resources/explosion.png");
        button.setPressedIcon(explosionIcon);

        // change image when hovering over button
        button.setRolloverIcon(new ImageIcon("src/resources/earth.png"));

        // just like label we can align the text relative the button itself
        button.setHorizontalTextPosition(JLabel.CENTER);
//        button.setVerticalTextPosition(JLabel.TOP);

        // change the color of the font
        button.setForeground(Color.WHITE);

        // change the background color of the font
        button.setBackground(Color.BLACK);

        // changing the color to null reverses change
        button.setBackground(null);

        // alignment
//        button.setHorizontalAlignment(SwingConstants.LEFT);
//        button.setVerticalAlignment(SwingConstants.BOTTOM);

        // margin
//        button.setMargin(new Insets(10, 50, 100, 10));

        // press alt + key to activate the button
        button.setMnemonic(KeyEvent.VK_E);

        // action command
        button.setActionCommand("Click");

//        // perform a click
//        button.doClick();
//
//        // perform a click after x milliseconds (not thread safe)
//        button.doClick(1000);

        // delays the next press by x milliseconds
        button.setMultiClickThreshhold(5000);

        button.setFocusPainted(false);

        button.setFont(new Font("Dialog", Font.BOLD, 72));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // get source
        if(e.getSource() == button){
            System.out.println("getSource(): I pressed a button");

            JOptionPane.showMessageDialog(this, "Boom!");
        }

        if(e.getSource() == button2){
            System.out.println("getSource(): I pressed a button2");
        }

        // get action command
        if(e.getActionCommand().equals("Easy")){
            System.out.println("getActionCommand(): I pressed a button");
        }
    }
}
