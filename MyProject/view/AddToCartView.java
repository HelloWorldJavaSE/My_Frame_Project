package view;

import service.ShopService;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class AddToCartView extends AppView {
    final ShopService shopService;

    public AddToCartView(ShopService shopService) {
        super("Add to cart",new ArrayList<>());
        this.shopService = shopService;
    }

    @Override
    public ArrayList<Component> getChildrenArrButtons() {
        ArrayList<Component> arrayList = new ArrayList<>();
        JTextField jTextField = new JTextField("Введите название продукта: ",16);
        jTextField.setFocusable(false);
        JTextField jTextField2 = new JTextField(" ",8);
        JTextField jTextField3 = new JTextField("Введите Id продукта: ",12);
        jTextField3.setFocusable(false);
        JTextField jTextField4 = new JTextField(" ",8);
        JButton jButton = new JButton("Enter");

        arrayList.add(jTextField);
        arrayList.add(jTextField2);
        arrayList.add(jTextField3);
        arrayList.add(jTextField4);
        arrayList.add(jButton);
        return arrayList;
    }

    @Override
    public JButton getJButton() {
        JButton jButton = new JButton(title);
        return jButton;
    }
}
