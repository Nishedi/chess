package com.company;

import javax.swing.*;

public class Frame extends JFrame {
    Panel panel;
    Frame() throws Exception{
        panel = new Panel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

}
