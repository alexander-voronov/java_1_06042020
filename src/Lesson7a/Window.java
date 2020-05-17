package Lesson7a;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    public Window() {
        setBounds(600, 200, 500, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("My Window");

//        setLayout(new FlowLayout());

//        setLayout(new GridLayout(4,4));
//
//        for (int i = 1; i <= 10; i++) {
//            JButton btn = new JButton("btn #"+ i);
//            add(btn);
//        }


        JPanel panelN = new JPanel();
        panelN.setLayout(new BoxLayout(panelN, BoxLayout.X_AXIS));
        JTextField textField = new JTextField();
        panelN.add(textField);
        JButton btnSqr = new JButton("SQR ");
        panelN.add(btnSqr);

        add(panelN, BorderLayout.NORTH);


        JPanel panelS = new JPanel(new GridLayout(1, 4));
        for (int i = 1; i <= 4; i++) {
            JButton btn = new JButton("btn #" + i);
            panelS.add(btn);
        }


        add(panelS, BorderLayout.SOUTH);


        btnSqr.addActionListener(e -> {
            int x = Integer.parseInt(textField.getText());
            textField.setText("" + x * x);
        });


        setVisible(true);

    }
}
