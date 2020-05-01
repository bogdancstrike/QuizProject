package client.gui;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame{
    private JButton creazaJocButton;
    private JButton intraInJocButton;
    private JTextField textField1;
    private JPanel mainPanel;

    public MainFrame(){
        creazaJocButton.addActionListener(ev -> {
            dispose(); //inchid fereastra curenta
            new CreateGameFrame();
        });

        intraInJocButton.addActionListener(ev -> {
            dispose();
            String gameId = textField1.getText();

            new JoinGameFrame(gameId);
        });

        setContentPane(mainPanel); //setam panoul principal
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

}
