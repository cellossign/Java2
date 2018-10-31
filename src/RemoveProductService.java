import java.util.ArrayList;

public class RemoveProductService {


    public void remove(ArrayList<Product> ProductList, String name) {

        ProductList.remove(ProductList.indexOf(name)); //indeks nepraviljnij
    }
}
