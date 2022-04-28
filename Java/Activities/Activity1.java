package activities;

public class Activity1 {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.make = 2022;
        obj.color = "Silver";
        obj.transmission = "Manual";
        obj.displayCharacteristics();
        obj.accelerate();
        obj.brake();

    }
}
