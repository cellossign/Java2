import java.util.ArrayList;

public class InMemoryDB implements  Database {

    public ArrayList <Product> productList=new ArrayList<Product>();

    @Override
    public void addProduct(Product product) {
        productList.add(product);
    }

    @Override
    public boolean deleteProduct(Product product) {
        productList.remove(productList.indexOf(product));
        return false;
    }

//    public void indexOfProduct(Product product){
//
//    }


}
