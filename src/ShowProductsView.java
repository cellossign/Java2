import java.util.ArrayList;

public class ShowProductsView {


    public void execute(ArrayList<Product> ProductList) {
        System.out.println("Here is your products' list");
        //System.out.println(ProductList);

        for (Product product : ProductList) {
            System.out.println(product.name);
        }

    }

}
