package data.models;

import data.models.CartItem;

import java.awt.*;
import java.util.ArrayList;

public class Order {

    public final String name; //Имя делающего заказ
    public final String address; //Адресс делающего заказ
    public final ArrayList<Component> cart; // Корзина с товарами делающего заказ
    public Order(String name, String address, ArrayList<Component> cart) {
        this.name = name;
        this.address = address;
        this.cart = cart;
    }
}
