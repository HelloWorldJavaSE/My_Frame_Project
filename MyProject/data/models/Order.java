package data.models;

import data.models.CartItem;

import java.awt.*;
import java.util.ArrayList;

public class Order {

    public final String name;
    public final String address;
    public final ArrayList<Component> cart;
    public Order(String name, String address, ArrayList<Component> cart) {
        this.name = name;
        this.address = address;
        this.cart = cart;
    }
}
