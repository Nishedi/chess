package com.company;

import java.awt.*;
import java.util.ArrayList;

public class Main {
static ArrayList<String> Board = new ArrayList<>();
static ShowAll x = new ShowAll();
static Map map = new Map();
    public static void main(String[] args) throws Exception {
        Frame frame = new Frame();
        Board.add("PPPPPPPP");
        Board.add("    P   ");
        Board.add("        ");
        Board.add("        ");
        Board.add("        ");
        Board.add("        ");
        Board.add("        ");
        Board.add("        ");
        map.create(Board);
    }
}
