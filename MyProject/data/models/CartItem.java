package data.models;

public class CartItem {

    public final Product product; //Продукт содержащий в корзине
    public CartItem(Product product) {
        this.product = product;
    }
}
