package controllers;

import service.ShopService;
import view.AppView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ShopController {
    private final JFrame frame;
    private final JPanel panel;
    private final ArrayList<Component> parentsButton; // =  Catalog.getJButton, Cart.getJButton, Order.getJButton
    private final JButton back;
    private final AppView appView;
    private final ShopService shopService;

    public ShopController(AppView appView, ShopService shopService) {
        this.appView = appView;
        this.shopService = shopService;
        frame = new JFrame(appView.title); // MainView.title = "Магазин"
        panel = new JPanel();
        frame.getContentPane().add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        parentsButton = new ArrayList<Component>();
        back = new JButton("Back"); //Кнопка которая будет возрощать все к началу программы
    }
    public void run() {
        frame.setVisible(true);
        //Заполняем ArrayList с основными кнопками
        for (int i = 0; i < appView.children.size(); i++) {
            parentsButton.add(appView.children.get(i).getJButton());
        }
        //Оброботчик нажатия на кнопку "Back" (Возрощает на начальный экран ((Catalog,Cart,Order + Back)))
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.removeAll();
                panel.setVisible(false);
                panel.setVisible(true);
                panelAdd(parentsButton);
            }
        });
        panelAdd(parentsButton); //Добавляем основные кнопки(Catalog,Cart,Order)

        new AllListener(panel,appView,shopService,back); // Класс Отвечающий за обработку нажатий
    }
    //Метод для добавления ArrayList<Component> на панель
    private  void panelAdd(ArrayList<Component> jButtons){
        for (int i = 0; i < jButtons.size(); i++) {
            panel.add(jButtons.get(i));
        }
    }
}

