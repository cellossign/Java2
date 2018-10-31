import java.util.ArrayList;
import java.util.Scanner;

public class AddProductView {

    private AddProductService addProductService;

    public AddProductView(AddProductService addProductService) {
        this.addProductService = addProductService;

    }

    public void execute() {
        System.out.println("Enter name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        addProductService.add(name);
        //add(ProductList,name);
    }

//    private void add(ArrayList<String> toDoList, String name) {
//        toDoList.add(name);
//    }


}




