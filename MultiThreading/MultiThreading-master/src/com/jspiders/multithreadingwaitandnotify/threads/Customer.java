package com.jspiders.multithreadingwaitandnotify.threads;

import com.jspiders.multithreadingwaitandnotify.threads.resources.Shop;

public class Customer extends Thread {
    private Shop shop;
    private int noOfProducts;

    public Customer(Shop shop, int noOfProducts) {
        this.shop = shop;
        this.noOfProducts = noOfProducts;
    }

    @Override
    public void run() {
        shop.purchaseProducts(noOfProducts);
    }
}
