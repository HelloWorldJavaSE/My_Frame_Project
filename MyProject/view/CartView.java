package view;

import data.models.CartItem;
import service.ShopService;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class CartView extends AppView{
    public final ShopService shopService; //Используеться для получения корзины

    public CartView(ShopService shopService) {
        super("Cart",new ArrayList<>());
        this.shopService = shopService;
    }
    //Это то что будет выводиться на окно (Cart) при нажатии на кнопку CartView.getJButton
    @Override
    public ArrayList<Component> getChildrenArrButtons() {
        return shopService.getCart();
    }
    //Метод для получения основной кнопки класса
    @Override
    public JButton getJButton() {
        JButton jButton = new JButton(title);
        return jButton;
    }
}
