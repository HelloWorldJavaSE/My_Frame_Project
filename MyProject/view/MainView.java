package view;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MainView extends AppView{
    //Главный класс который соеденяет (CatalogView,CartView,OrderView)
    public MainView(ArrayList<AppView> children) {
        super( "Магазин",children);
    }

    //возрощает Null из за ненадобности
    @Override
    public ArrayList<Component> getChildrenArrButtons() {
        return null;
    }
    //возрощает Null из за ненадобности
    @Override
    public JButton getJButton() {
        JButton jButton = new JButton(title);
        return jButton;
    }
}
