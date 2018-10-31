import java.util.ArrayList;

public class InMemoryDB implements  Database {

    private ArrayList <Product> productList=new ArrayList<Product>();

    @Override
    public void addProduct(Product product) {

        productList.add(product);

    }
}
