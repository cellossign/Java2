import java.util.ArrayList;
import java.util.Scanner;

public class RemoveProductView {

    private RemoveProductService removeProductService;

    public RemoveProductView(RemoveProductService removeProductService) {
        this.removeProductService = removeProductService;
    }

    public void execute() {
        System.out.println("Enter name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        //System.out.println("The index of this item is: " + ProductList.lastIndexOf(name));

        removeProductService.remove(name);


    }
//
//    public void remove(ArrayList<String> toDoList, String name) {
//        toDoList.remove(toDoList.indexOf(name)); //indeks nepraviljnij
//    }
}
