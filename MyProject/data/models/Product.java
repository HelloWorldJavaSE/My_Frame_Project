package data.models;
public class Product {
    //Сам продукт
    public final String id; //Id
    public final String title; //Название продукта

    public Product(String id, String title) {
        this.id = id;
        this.title = title;
    }
    //Метод для получения информации о продукте
    public String getInfo(){
        return "Product: Id: "+id + ", " + title;
    }

}
