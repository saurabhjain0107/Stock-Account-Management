package com.bridgelabz;

import java.util.Scanner;

public class Stock {
    String shareName;
    int numberOfShares;
    float sharePrice;
    float stockValue;

    @Override
    public String toString() {
        return "Stock{" +
                "shareName='" + shareName + '\'' +
                ", numberOfShares=" + numberOfShares +
                ", sharePrice=" + sharePrice +
                ", stockValue=" + stockValue +
                '}';
    }
    public float valueOfEachStock(){
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter Share name");
       shareName = sc.next();
        System.out.println("Enter Number of share ");
       numberOfShares = sc.nextInt();
        System.out.println("Enter price of share ");
       sharePrice =  sc.nextFloat();
        System.out.println("Total value of share");
       return numberOfShares * sharePrice;
    }

    public static void main(String[] args) {
        Stock obj = new Stock();
        System.out.println(obj.valueOfEachStock());
    }

}
