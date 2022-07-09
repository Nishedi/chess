package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel extends JPanel implements ActionListener {
    Timer timer;
    final int Panel_width = 1400;
    final int Panel_height = 1400;
    int counter=0;
    Map map= new Map();
    Obj obj = null;

    Panel() throws Exception{

        this.setPreferredSize(new Dimension(Panel_width, Panel_height));
        this.setBackground(Color.black);


        timer = new Timer(50, this);
        timer.start();

    }

    public void paint (Graphics G) {
        super.paint(G);
        Image img = new ImageIcon("szachownica.png").getImage();
        Graphics2D G2D = (Graphics2D) G;
        G2D.setColor(Color.CYAN);
        //G2D.drawImage(img,0,0,null);

        for(Obj i: map.map){
            i.paint(G2D);
        }

        /*for(int i = 0; i<=9;i++) {
            G2D.drawLine(70+i*100, 70, 70+i*100, 970);
            G2D.drawLine(70, 70+i*100, 970, 70+i*100);
        }
        G2D.setColor(Color.white);
        for(int i = 0; i<=3;i++) {
            G2D.drawLine(70+i*300, 70, 70+i*300, 970);
            G2D.drawLine(70, 70+i*300, 970, 70+i*300);
        }*/
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}
