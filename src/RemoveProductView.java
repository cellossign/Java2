import java.util.ArrayList;
import java.util.Scanner;

public class RemoveProductView {


    public void execute(ArrayList<String> toDoList) {
        System.out.println("Enter name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("The index of this item is: " + toDoList.lastIndexOf(name));
        toDoList.remove(toDoList.indexOf(name)); //indeks nepraviljnij
    }
}
