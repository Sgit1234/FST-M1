package activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        ArrayList<String> myList= new ArrayList<String>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Cherry");
        myList.add("Melon");
        myList.add(3,"Grapes");
        for (String s:myList)
            System.out.println(s);

            System.out.println("Third item is: " + myList.get(2));
            System.out.println("Is mango in the list? " + myList.contains("Mango"));
            System.out.println("Number of items are " + myList.size());
            myList.remove(4);
            System.out.println("After removing an item, the number of items are " + myList.size());
        }
    }


