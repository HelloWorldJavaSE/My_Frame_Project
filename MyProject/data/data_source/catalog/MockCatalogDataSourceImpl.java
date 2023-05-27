package data.data_source.catalog;

import data.models.Product;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MockCatalogDataSourceImpl extends CatalogDataSource{

    @Override
    public ArrayList<Component> getCatalog() {
        ArrayList<Component> products =new ArrayList<>();
        //Для теста уже есть несколько товаров в каталоге
        JTextField jTextField = new JTextField(new Product("1","Картошка").getInfo(),15);
        JTextField jTextField1 = new JTextField(new Product("2","Макароны").getInfo(),15);
        jTextField.setFocusable(false);
        jTextField1.setFocusable(false);
        products.add(jTextField);
        products.add(jTextField1);
        return products;
    }
}
