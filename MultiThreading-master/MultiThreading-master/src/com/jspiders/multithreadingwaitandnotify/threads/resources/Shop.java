package com.jspiders.multithreadingwaitandnotify.threads.resources;

public class Shop {
    private int noOfProducts;

    public Shop(int noOfProducts) {
        this.noOfProducts = noOfProducts;
    }

    public synchronized void restockProducts(int restockProducts) {
        noOfProducts += restockProducts;
        System.out.println(restockProducts + " Successfully added.");
        System.out.println("Available products " + noOfProducts);
        this.notifyAll();
    }

    public synchronized void purchaseProducts(int purchaseProducts) {
        if (noOfProducts < purchaseProducts) {
            System.out.println(purchaseProducts + " Available products");
        }
        try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        noOfProducts -= purchaseProducts;
        System.out.println(purchaseProducts + " Successfully purchased.");
        System.out.println("Now available products " + noOfProducts);
    }
}