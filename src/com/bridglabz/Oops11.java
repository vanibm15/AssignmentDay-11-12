package com.bridglabz;

import java.util.Scanner;
public class Oops11//stock
{
    String stockName;
    int numberOfShares, sharePrice, totalValue;
    public static void main(String[] args) {
        int i1 = 10;
        Oops11[] object = new Oops11[][ 10];
        int i;
        for (i = 0; i < 5; i++)
            object[i].getData();
        for (i = 0; i < 5; i++) {
            object[i].calculate();
            object[i].display();
        }
    }
    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the stock information");
        System.out.println(" Name              :     ");
        stockName = scanner.next();
        System.out.println(" Number Of Shares  :     ");
        numberOfShares = scanner.nextInt();
        System.out.println(" Share Price       :     ");
        sharePrice = scanner.nextInt();
    }
    public void calculate() {
        totalValue = sharePrice * numberOfShares;
    }
    public void display() {
        System.out.println("Stock name          :   " + stockName);
        System.out.println("Number of shares    :   " + numberOfShares);
        System.out.println(" Share Price        :   " + sharePrice);
        System.out.println(" Total value        :   " + totalValue);
    }
}
