package com.company;

import java.util.ArrayList;

public class Map {
        ArrayList<Obj> map = new ArrayList<>();
        //Obj possitions[][] = new Obj[8][8];
        public void create(ArrayList<String> board){
        int x = 0;
        int y = 0;
        for(String i: board){
            x=0;
            y=0;
            //System.out.print("X");
            for(int j = 0; j<=7; j++){


                if(i.charAt(j)=='P') {
                    pion obj = new pion(x,y, 'P');
                    map.add(obj);
                   // possitions[x][y]=obj;
                }
                if(i.charAt(j)=='H') {
                    //skoczek obj = new pion(x,y);
                   // map.add(obj);
                }

                y=y+1;

            }
            //System.out.println("X");
            x=x+1;

        }
        //System.out.println(x+" "+y);
    }
}
