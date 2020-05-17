package Lesson8;

import javax.swing.*;
import java.awt.*;

public class Message extends JFrame {

    private StartNewGameWindow startNewGameWindow;

    private static final int MESSAGE_HEIGHT = 150;
    private static final int MESSAGE_WIDTH = 300;
    private static final int WIN_POS_X = 600;
    private static final int WIN_POS_Y = 400;

    public Message(StartNewGameWindow startNewGameWindow) {
        this.startNewGameWindow = startNewGameWindow;
        setBounds(WIN_POS_X, WIN_POS_Y, MESSAGE_WIDTH, MESSAGE_HEIGHT);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Message");
        setResizable(false);


        JPanel bottomPanel = new JPanel(new GridLayout(1, 2));


        Label one = new Label(Logic.TEXT);
        add(one, BorderLayout.CENTER);


        JButton btnExit = new JButton("Exit");
        bottomPanel.add(btnExit);

        btnExit.addActionListener(e -> {
            System.exit(0);
        });

        add(bottomPanel, BorderLayout.SOUTH);

        setVisible(true);
    }
}
