package com.hillel.lesson15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ChessGame {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        List<Chessitem> chessitems = new ArrayList<>();

//        Chessitem item = new Pawn();
//        chessitems.add(item); //hinzufügen in die kollektion
//        chessitems.add(new King());

        String input;
        while(!(input = READER.readLine()).equals("stop")){
            // während das was wir lesen nicht gleich stop ist:
            chessitems.add(createChessitem(input));
        }
        drawChessItems(chessitems);

        Drawable chessboard = new ChessBoard();
        draw(chessboard);

    }

    //fabric method
    public static Chessitem createChessitem(String chessItemName) {
        switch (chessItemName){
            case "pawn":
                return new Pawn();
            case "king":
                return new King();
            case "queen":
                return new Queen();
            default:
                throw new IllegalArgumentException("Unknown chess item name");
        }
    }

    private static void draw(Drawable drawable){
        drawable.draw();
    }
    private static void drawChessItems(List<Chessitem> chessitems){
        for (Chessitem chessitem :chessitems){ //um die Kollektion zu malen
             draw(chessitem);
        }
    }
}
