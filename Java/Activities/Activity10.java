package activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("Toys");
        hs.add("Books");
        hs.add("Dresses");
        hs.add("Chocolates");
        hs.add("Gifts");
        hs.add("Cookies");
        System.out.println("Total no. of items intially: " + hs.size());
        System.out.println("Items: " + hs);
        hs.remove("Gifts");
        if(hs.remove("Dolls"))
            System.out.println("Dolls are removed from the list");
        else
            System.out.println("Dolls are not present in the list");
        System.out.println("Is notebook available in the list? " + hs.contains("Notebook"));
        System.out.println("Final items in the list are:");
        for (String H:hs)
            System.out.println(H);
    }

}
