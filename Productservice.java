import java.util.ArrayList;

public class Productservice {

    private static ArrayList<String> productlist = new ArrayList<>();

    public static void main(String[] args) {
        productlist.add("Apfel");
        productlist.add("Birne");
        productlist.add("Banane");
        productlist.add("Orange");

        System.out.println(productlist);
    }
}