package controllers;

import service.ShopService;
import view.AppView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class AddToCartListener implements MouseListener {

    private final JPanel panel;
    private final AppView appView;

    private final JButton back; //Кнопка возрощающая нас на главный экран
    private final ShopService shopService; // Используеться для добовления товара в корзину (shopService.addToCart)


    public AddToCartListener(JPanel panel, AppView appView,JButton back,ShopService shopService) {
        this.shopService = shopService;
        this.back = back;
        this.panel = panel;
        this.appView = appView;
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        panel.removeAll();
        panel.setVisible(false);
        panel.setVisible(true);
        //Добавляем на панель все кнопки у AddToCartView
        JTextField input1 = ((JTextField) appView.children.get(0).children.get(0).getChildrenArrButtons().get(1));
        JTextField input2 =(JTextField) appView.children.get(0).children.get(0).getChildrenArrButtons().get(3);
        for (int i = 0; i <=appView.children.get(0).children.get(0).getChildrenArrButtons().size() ; i += 2) {
            panel.add(appView.children.get(0).children.get(0).getChildrenArrButtons().get(i));
            if(i == 0) {
                panel.add(input1);
            }if(i==2) {
                panel.add(input2);
            }
        }
        //Обработчик события для кнопки Enter у AddToCart
         panel.getComponent(panel.getComponentCount()-1).addMouseListener(new MouseListener() {
                     @Override
                     public void mouseClicked(MouseEvent e) {
                         shopService.addToCart(input1.getText(),input2.getText());
                         back.doClick();
                     }

                     @Override
                     public void mousePressed(MouseEvent e) {

                     }

                     @Override
                     public void mouseReleased(MouseEvent e) {

                     }

                     @Override
                     public void mouseEntered(MouseEvent e) {

                     }

                     @Override
                     public void mouseExited(MouseEvent e) {

                     }
                 });
        panel.add(back);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
