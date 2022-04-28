package activities;

public class Car {
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;

    Car()
    {
        tyres=4;
        doors=4;
    }

    public void displayCharacteristics() {
        System.out.println("The color of the car is " + color);
        System.out.println("The transmission of the car is " + transmission);
        System.out.println("The make of the car is " + make);
        System.out.println("The tyres of the car are " + tyres);
        System.out.println("The doors of the car are " + doors);

    }

    public void accelerate()
    {

        System.out.println("During acceleration, the car is moving forward as expected");
    }

    public void brake()
    {
        System.out.println("While applying brake, the car is getting stopped as expected");
    }

}