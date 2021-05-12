// Matthew Rieckenberg

package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    private int count = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;

    public GUI(){



        frame = new JFrame();
        JButton button = new JButton("Click me");

        button.addActionListener(this);


        label = new JLabel("Number of clicks: 0");
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(300,300,100,300));
        panel.setLayout(new GridLayout(0,5));
        frame.add(panel,BorderLayout.CENTER);

        // Add buttons and labels
        panel.add(button);
        panel.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Grade Calculator");
        frame.pack();
        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks: "+count);
    }
}
