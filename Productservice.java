import java.util.ArrayList;
import java.util.HashMap;

/*
    Simple Class just for demo
 */
public class Productservice {

    private static ArrayList<String> products = new ArrayList<>();
    private static ArrayList<String> shoppinglist = new ArrayList<>();


    public static void main(String[] args) {
        products.add("Apfel");
        products.add("Birne");
        products.add("Banane");
        products.add("Orange");
        products.add("Pfirsich");

        for(int i= 0; i < products.size() ; i++) {
            if(products.get(i).equals("Banane")||products.get(i).equals("Orange")){
                shoppinglist.add(products.get(i));
            }
        }
        System.out.println(shoppinglist);
    }
}