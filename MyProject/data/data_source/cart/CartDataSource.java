package data.data_source.cart;

import data.models.CartItem;
import data.models.Product;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public abstract class CartDataSource {

    //Метод для получения корзины
    public abstract ArrayList<Component> getCatalog();
    //Метод для добавления товар в корзину
    public abstract void addToCart(Product product);
}
