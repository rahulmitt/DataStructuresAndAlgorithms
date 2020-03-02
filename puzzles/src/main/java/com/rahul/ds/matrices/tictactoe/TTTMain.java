package com.rahul.ds.matrices.tictactoe;

import java.util.Scanner;

public class TTTMain {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        Scanner s = new Scanner(System.in);
        int x = 0, y = 0;
        do {
            System.out.println(game.player == game.X ? "Player X turn" : "Player O turn");
            System.out.println("Enter x and y places");
            x = s.nextInt();
            y = s.nextInt();

            game.putSign(x, y);
            System.out.println(game);
            System.out.println("_____________________________");
            game.displayWinner();
        } while (!game.full);
    }
}
