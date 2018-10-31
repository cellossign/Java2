import java.util.ArrayList;
import java.util.Scanner;

public class AddProductView {

    private AddProductService addProductService;

    public AddProductView(AddProductService addProductService) {
        this.addProductService = addProductService;

    }

    public void execute(ArrayList<String> toDoList) {
        System.out.println("Enter name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        addProductService.add(toDoList, name);
        //add(toDoList,name);
    }

//    private void add(ArrayList<String> toDoList, String name) {
//        toDoList.add(name);
//    }


}




