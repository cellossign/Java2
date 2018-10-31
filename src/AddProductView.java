import java.util.ArrayList;
import java.util.Scanner;

public class AddProductView {



    public void execute(ArrayList<String> toDoList) {
        System.out.println("Enter name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        toDoList.add(name);
        //add(toDoList,name);
    }



}




