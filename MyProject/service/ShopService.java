package service;

import data.data_source.cart.CartDataSource;
import data.data_source.catalog.CatalogDataSource;
import data.data_source.order.OrderDataSource;

import data.models.Order;
import data.models.Product;


import java.awt.*;
import java.util.ArrayList;

public class ShopService {
    final CatalogDataSource catalogDataSource; //Используеться для получения каталога
    final CartDataSource cartDataSource; //Используеться для получения корзины и для добовления товара в корзину
    final OrderDataSource orderDataSource; //Используеться для создания заказа

    public ShopService(CatalogDataSource catalogDataSource ,CartDataSource cartDataSource, OrderDataSource orderDataSource) {
        this.catalogDataSource = catalogDataSource ;
        this.cartDataSource = cartDataSource;
        this.orderDataSource = orderDataSource;
    }
    //Метод для Получение каталога
    public ArrayList<Component> getCatalog(){
        return catalogDataSource.getCatalog();
    }
    //Метод для Получение корзины
    public ArrayList<Component> getCart(){
        return cartDataSource.getCatalog();
    }

    //Метод для Добавления в корзину
    public boolean addToCart(String name,String id){
        cartDataSource.addToCart(new Product(id,name));
        return true;
    }
    //Метод для создания заказа
    public void createOrder(String name, String address){
        ArrayList<Component> cart = getCart();
        Order  order= new Order(name,address,cart);
        orderDataSource.createOrder(order);
    }
}
