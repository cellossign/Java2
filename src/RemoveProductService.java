import java.util.ArrayList;

public class RemoveProductService {


    public void remove(ArrayList<String> toDoList, String name) {
        toDoList.remove(toDoList.indexOf(name)); //indeks nepraviljnij
    }
}
