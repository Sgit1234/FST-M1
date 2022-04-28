package activities;


import java.util.HashMap;

public class Activity11 {
    public static void main(String[] args) {
        HashMap<Integer, String> colours = new HashMap<Integer,String>();
        colours.put(1,"Pink");
        colours.put(2,"Blue");
        colours.put(3,"Yellow");
        colours.put(4,"Red");
        colours.put(5, "Green");
        System.out.println("Colours in the map are: " + colours);
        colours.remove(1);
        System.out.println("After removing a colour: " + colours);
        System.out.println("Does green colour exist? "+ colours.containsValue("Green"));
        System.out.println("Current no. of colours: " + colours.size());
}
}
