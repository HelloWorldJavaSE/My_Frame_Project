package data.data_source.cart;

import data.models.CartItem;
import data.models.Product;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public abstract class CartDataSource {
    //Устанавливаем самый минимум для всех CartDataSourceImpl
    public abstract ArrayList<Component> getCatalog();
    public abstract void addToCart(Product product);
}
