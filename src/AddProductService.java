import java.util.ArrayList;

public class AddProductService {

    private Database db;

    public AddProductService(Database db) {
        this.db = db;
    }

    public void add(String name) {
        Product product = new Product();
        product.name = name;

        db.addProduct(product);//sozdannij produkt otpravili v bazu dannih
    }
}
