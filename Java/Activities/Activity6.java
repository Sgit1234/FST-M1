package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


class Plane {
        public List<String> passengers;
        public int maxPassengers;
        private Date lastTimeTookOff;
        private Date lastTimeLanded;

        public Plane(int maxPassengers) {
            this.maxPassengers = maxPassengers;
            this.passengers = new ArrayList<>();
        }
        public void onboard(String passenger)
        {
            this.passengers.add(passenger);
        }
        public Date takeOff() {
            this.lastTimeTookOff = new Date();
            return lastTimeTookOff;
        }

        public void land() {
            this.lastTimeLanded = new Date();
             }

        public Date getLastTimeLanded() {
            return lastTimeLanded;
        }
        public List<String> getPassengers() {
            return passengers;
       }
    }
public class Activity6 {
    public static void main(String[] args) throws InterruptedException {
        Plane plane = new Plane(10);
        plane.maxPassengers = 10;
        plane.onboard("Akash");
        plane.onboard("Booma");
        plane.onboard("Chandru");
        plane.onboard("Surya");

        System.out.println("Time of takeoff is " + plane.takeOff());
        System.out.println("The passengers in the flight are " + plane.getPassengers());
        Thread.sleep(5000);
        plane.land();
        System.out.println("Time of landing is " + plane.getLastTimeLanded());
        System.out.println("People who landed are " + plane.getPassengers());
    }
}
