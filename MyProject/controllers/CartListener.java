package controllers;

import view.AppView;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CartListener implements MouseListener {
    private final JPanel panel;
    private final AppView appView;
    private final JButton back;


    public CartListener(JPanel panel, AppView appView,JButton back) {
        this.back = back;
        this.panel = panel;
        this.appView = appView;
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        panel.removeAll();
        panel.setVisible(false);
        panel.setVisible(true);
        // appView.children.get(1).getChildrenArrButtons() == shopService.getCart
        for (int i = 0; i < appView.children.get(1).getChildrenArrButtons().size(); i++) {
           panel.add(appView.children.get(1).getChildrenArrButtons().get(i));
        }
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
