package com.company;

import javax.swing.*;
import java.awt.*;

public class Obj {
    Possition pos=new Possition(0,0);
    char typ=' ';
    Image img = null;
    public Obj(int x, int y, char typ){
        this.pos.x=x;
        this.pos.y=y;
        this.typ=typ;
    }
    public void paint(Graphics G2D){
        G2D.drawImage(img, pos.x*50, pos.y*50,null);
    }
}
