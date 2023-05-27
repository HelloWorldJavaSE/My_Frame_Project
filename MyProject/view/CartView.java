package view;

import data.models.CartItem;
import service.ShopService;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class CartView extends AppView{
    public final ShopService shopService;

    public CartView(ShopService shopService) {
        super("Cart",new ArrayList<>());
        this.shopService = shopService;
    }

    @Override
    public ArrayList<Component> getChildrenArrButtons() {
        return shopService.getCart();
    }

    @Override
    public JButton getJButton() {
        JButton jButton = new JButton(title);
        return jButton;
    }
}
