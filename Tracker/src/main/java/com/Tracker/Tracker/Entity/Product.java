package com.Tracker.Tracker.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private  int price;
    private String item;
    private int count;

    public Product (int id, int price, String item, int count){
        this.id=id;
        this.price=price;
        this.item=item;
        this.count=count;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        price = price;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
