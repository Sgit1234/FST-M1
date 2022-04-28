package activities;

public class Activity3 {
    public static void main(String[] args) {
        double ageInSec = 1000000000;
        double ear = 31557600;
        double mer = 0.2408467 * ear;
        double ven = 0.61519726 * ear;
        double mar = 1.8808158 * ear;
        double jup = 11.862615 * ear;
        double sat = 29.447498 * ear;
        double ura = 84.016846  * ear;
        double nep = 164.79132 * ear;

        System.out.println("Your age in Mercury is " + ageInSec/mer);
        System.out.println("Your age in Venus is " + ageInSec/ven);
        System.out.println("Your age in Earth is " + ageInSec/ear);
        System.out.println("Your age in Mars is " + ageInSec/mar);
        System.out.println("Your age in Jupiter is " + ageInSec/jup);
        System.out.println("Your age in Saturn is " + ageInSec/sat);
        System.out.println("Your age in Uranus is " + ageInSec/ura);
        System.out.println("Your age in Neptune is " + ageInSec/nep);
    }
}


