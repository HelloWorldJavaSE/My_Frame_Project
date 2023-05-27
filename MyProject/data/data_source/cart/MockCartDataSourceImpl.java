package data.data_source.cart;

import data.models.CartItem;
import data.models.Product;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MockCartDataSourceImpl extends CartDataSource{
    //Реализуем весь минимум для работы установленый в абстрактном классе CartDataSource
    private ArrayList<CartItem> cart = new ArrayList<>();

    @Override
    public ArrayList<Component> getCatalog() {
        ArrayList<Component> jText = new ArrayList<>();
        for (int i = 0; i < cart.size(); i++) {
            jText.add(new JTextField(cart.get(i).product.getInfo()));
        }
        return jText;
    }

    @Override
    public void addToCart(Product product) {
        cart.add(new CartItem(product));
    }
}
