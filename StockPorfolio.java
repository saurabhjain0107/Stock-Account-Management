package com.bridgelabz;

import java.util.Scanner;

public class StockPorfolio {
    int numberOfShare;
    double valueOfTotalStock;
    Stock obj = new Stock();

    public void stockPortFolio(){
        Scanner str = new Scanner(System.in);
        System.out.println("Enter number of share :");
        numberOfShare = str.nextInt();
        double[] stocksValue = new double[numberOfShare];
        String[] stockNames = new String[numberOfShare];
        System.out.println("Enter all the Stock name ");
        for (int i = 0; i < numberOfShare; i++) {
            stockNames[i] = str.next();
        }
        for (int i = 0; i < numberOfShare; i++){
            System.out.println("Enter " + stockNames[i] + " number of shares: and share price: ");
            stocksValue[i] = obj.valueOfEachStock();
            valueOfTotalStock += stocksValue[i];
        }
        for (int i = 0; i < numberOfShare; i++){
            System.out.println(stockNames[i] + " current value is " + stocksValue[i]);
        }
        System.out.println("Total Stock Value " + valueOfTotalStock);
    }

}
