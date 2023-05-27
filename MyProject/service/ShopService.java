package service;

import data.data_source.cart.CartDataSource;
import data.data_source.catalog.CatalogDataSource;
import data.data_source.order.OrderDataSource;

import data.models.Order;
import data.models.Product;


import java.awt.*;
import java.util.ArrayList;

public class ShopService {
    final CatalogDataSource catalogDataSource;
    final CartDataSource cartDataSource;
    final OrderDataSource orderDataSource;

    public ShopService(CatalogDataSource catalogDataSource ,CartDataSource cartDataSource, OrderDataSource orderDataSource) {
        this.catalogDataSource = catalogDataSource ;
        this.cartDataSource = cartDataSource;
        this.orderDataSource = orderDataSource;
    }
    public ArrayList<Component> getCatalog(){
        return catalogDataSource.getCatalog();
    }
    public ArrayList<Component> getCart(){
        return cartDataSource.getCatalog();
    }
    public boolean addToCart(String name,String id){
        cartDataSource.addToCart(new Product(id,name));
        return true;
    }
    public void createOrder(String name, String address){
        ArrayList<Component> cart = getCart();
        Order  order= new Order(name,address,cart);
        orderDataSource.createOrder(order);
    }
}
