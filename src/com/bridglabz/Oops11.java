package com.bridglabz;

import java.util.Scanner;
public class Oops11//stock
{
    int numberOfPlayers;

    void Players() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Enter the number of players in a game : ");
        numberOfPlayers = scanner.nextInt();
        if (numberOfPlayers < 2 && numberOfPlayers > 4) {
            System.out.println("Number of players should be between 2 to 4.");
            System.exit(0);
        }
    }



    public static void main(String[] args) {
        public void distribute; {
            Oops11 cards = new Oops11();
            cards.shuffle();
            cards.displayCards();
        }
    }

    private void shuffle() {
    }
}