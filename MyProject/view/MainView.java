package view;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MainView extends AppView{
    //Связуещие звено
    public MainView(ArrayList<AppView> children) {
        super( "Shop",children);
    }


    @Override
    public ArrayList<Component> getChildrenArrButtons() {
        return null;
    }

    @Override
    public JButton getJButton() {
        JButton jButton = new JButton(title);
        return jButton;
    }
}
