import java.util.ArrayList;
import java.util.Scanner;

public class RemoveProductView {

    private RemoveProductService removeProductService = new RemoveProductService();

    public RemoveProductView(RemoveProductService removeProductService) {
        this.removeProductService = removeProductService;
    }

    public void execute(ArrayList<String> toDoList) {
        System.out.println("Enter name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("The index of this item is: " + toDoList.lastIndexOf(name));
        removeProductService.remove(toDoList, name);
    }
//
//    public void remove(ArrayList<String> toDoList, String name) {
//        toDoList.remove(toDoList.indexOf(name)); //indeks nepraviljnij
//    }
}
