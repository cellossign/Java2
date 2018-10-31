import java.util.*;

public class Main {
    public static void main(String[] args) {
        //toDoList=createList();
        ArrayList<String> toDoList = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        boolean wantToContinue = true;
        while (wantToContinue == true) {
            System.out.println("Choose an action: 1 - add item, 2-delete item, 3-show list, 4-exit");
            String choice = sc.nextLine();

            if (choice.equals("1")) {
                addProduct(toDoList);
                wantToContinue = true;
            }
            if (choice.equals("2")) {
                removeProduct(toDoList);
                wantToContinue = true;
                //remove(name);
            }
            if (choice.equals("3")) {
                showProducts(toDoList);
                wantToContinue = true;
                //showList();
            }
            if (choice.equals("4")) {
                System.out.println("Thank you for using our product!");
                wantToContinue = false;
            }
        }
        sc.close();
    }

    private static void showProducts(ArrayList<String> toDoList) {
        System.out.println("Here is your products' list");
        System.out.println(toDoList);//vivodit kakoj-to [name] vmesto spiska
    }

    private static void removeProduct(ArrayList<String> toDoList) {
        System.out.println("Enter name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("The index of this item is: " + toDoList.lastIndexOf(name));
        toDoList.remove(toDoList.indexOf(name)); //indeks nepraviljnij
    }

    private static void addProduct(ArrayList<String> toDoList) {
        System.out.println("Enter name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        toDoList.add(name);
        //add(toDoList,name);
    }

//    public static void add(String name) {
//       toDoList.add
//
//    }

//    public static void remove(String name) {
//
//    }


//    public static void showList() {
//
//    }

//    public static ArrayList createList() {
//        ArrayList<String> toDoList=new ArrayList<String>();
//        return toDoList;
//    }
}
