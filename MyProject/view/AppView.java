package view;


import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public abstract class  AppView {
    public final String title; // Текст который мы будем выводить

    public final ArrayList<AppView> children; //Доступ к унаследовавшим этот класс
    public AppView( String title, ArrayList<AppView> children) {
        this.title = title;
        this.children = children;
    }
    public abstract ArrayList<Component> getChildrenArrButtons();
    //Будет использоваться для отброжения ПодКнопок после нажатия на основную

    public abstract JButton getJButton(); //Получение основной кнопки наследника например: "Catalog";

}
