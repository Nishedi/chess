package com.company;

import javax.swing.*;
import java.awt.*;

public class pion extends  Obj{
    char typ = ' ';
    Image img = null;
    public pion(int x, int y,char typ){
        super(x,y, typ);
        img = new ImageIcon("pion.png").getImage();
    }
}
