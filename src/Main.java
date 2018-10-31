import java.util.*;

public class Main {
    public static void main(String[] args) {
        //ProductList=createList();
        //ArrayList<Product> ProductList = new ArrayList<Product>();

        Scanner sc = new Scanner(System.in);
        boolean wantToContinue = true;

        Database db=new InMemoryDB();

        AddProductService a = new AddProductService(db);
        AddProductView addProductView = new AddProductView(a);

        RemoveProductService r = new RemoveProductService(db);
        RemoveProductView removeProductView = new RemoveProductView(r);


        ShowProductsView showProductsView = new ShowProductsView();

        while (wantToContinue == true) {
            System.out.println("Choose an action: 1 - add item, 2-delete item, 3-show list, 4-exit");
            String choice = sc.nextLine();

            if (choice.equals("1")) {
                addProductView.execute();
                wantToContinue = true;
            }
            if (choice.equals("2")) {
                removeProductView.execute();
                wantToContinue = true;
                //remove(name);
            }
            if (choice.equals("3")) {
                showProductsView.execute(ProductList);
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

//    private static void showProducts(ArrayList<String> toDoList) {
//        System.out.println("Here is your products' list");
//        System.out.println(toDoList);//vivodit kakoj-to [name] vmesto spiska
//    }

//    private static void removeProduct(ArrayList<String> toDoList) {
//        System.out.println("Enter name");
//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//        System.out.println("The index of this item is: " + toDoList.lastIndexOf(name));
//        toDoList.remove(toDoList.indexOf(name)); //indeks nepraviljnij
//    }

//    private static void addProduct(ArrayList<String> toDoList) {
//        System.out.println("Enter name");
//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//        toDoList.add(name);
//        //add(toDoList,name);
//    }

}
