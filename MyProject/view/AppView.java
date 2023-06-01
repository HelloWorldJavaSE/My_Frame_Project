package view;


import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public abstract class  AppView {
    public final String title; // Текст который будет содержать основная кнопка (getJButton)

    public final ArrayList<AppView> children; //Дочернии  классы
    public AppView( String title, ArrayList<AppView> children) {
        this.title = title;
        this.children = children;
    }
    //То что будет отоброжаться после нажатия на основную кнопку (getJButton)
    public abstract ArrayList<Component> getChildrenArrButtons();

    public abstract JButton getJButton(); //Получение основной кнопки

}
