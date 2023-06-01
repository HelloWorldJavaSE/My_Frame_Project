
import controllers.ShopController;
import data.data_source.cart.CartDataSource;
import data.data_source.cart.MockCartDataSourceImpl;
import data.data_source.catalog.CatalogDataSource;
import data.data_source.catalog.MockCatalogDataSourceImpl;
import data.data_source.order.MockOrderDataSourceImpl;
import data.data_source.order.OrderDataSource;
import service.ShopService;
import view.*;

import java.util.ArrayList;

import java.util.List;

public class Main {
    //Создания объектов и запуск программы
    public static void main(String[] args) {
        CatalogDataSource catalogDataSource = new MockCatalogDataSourceImpl(); //data_source Catalog
        CartDataSource cartDataSource = new MockCartDataSourceImpl(); //data_source Cart
        OrderDataSource orderDataSource = new MockOrderDataSourceImpl(); //data_source Order
        //Главный класс для работы с данными
        ShopService shopService = new ShopService(catalogDataSource,cartDataSource,orderDataSource);
        //Визуал для Cart
        CartView cartView = new CartView(shopService);
        //Визуал для Catalog (+ AddToCartView)
        CatalogView catalogView = new CatalogView(shopService,new ArrayList<>(List.of(new AddToCartView())));
        //Главный соеденяющий всю View часть
        MainView mainView = new MainView(new ArrayList<>(List.of(catalogView,cartView,new OrderView())));

        //Главный контролер
        new ShopController(mainView,shopService).run();
    }
}