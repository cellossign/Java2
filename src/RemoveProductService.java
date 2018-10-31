import java.util.ArrayList;

public class RemoveProductService {

    private Database db;

    public RemoveProductService (Database db){
        this.db=db;
    }

    public void remove(String name) {

        for (Product product : db.productList) {
            if ((product.name).equals(name)) {
                db.deleteProduct(product);
            }
            ;
        }




    }
}
