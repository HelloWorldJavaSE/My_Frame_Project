package data.models;
public class Product {
    //Сам продукт
    public final String id;
    public final String title;

    public Product(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public String getInfo(){
        return "Product: Id: "+id + ", " + title;
    }

}
