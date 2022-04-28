package activities;

       interface BicycleParts
       {
        public int gears=0;
        public int speed=0;
       }

    interface BicycleOperations {

        public void applyBrake(int decspeed);
        public void speedUp(int incspeed);
    }

    class Bicycle implements BicycleParts, BicycleOperations {

            public int gears;
            public int speed;
            public Bicycle (int gears, int speed)
            {
                this.gears = gears;
                this.speed = speed;
            }
        public void applybrake(int decspeed)
        {
            speed=speed-decspeed;
            System.out.println("Speed after applying brake " + speed);
        }

        @Override
        public void applyBrake(int decspeed) {
            this.speed=speed;
        }

        public void speedUp(int incspeed)
            {
                speed=speed+incspeed;
                System.out.println("Speed after acceleration " + speed);
            }
        public String bicycleDesc(){
            return ("No. of gears " + gears + "\nCurrent Speed is " + speed);
        }
        }
        class MountainBike extends Bicycle {
            public int seatHeight;

            public MountainBike(int gears, int speed, int startHeight) {
                super(gears, speed);
                seatHeight = startHeight;
            }

            public void seatHeight(int newValue) {
                seatHeight = newValue;
            }

            public String bicycleDesc() {
                return (super.bicycleDesc() + "\nSeat height is " + seatHeight);

            }
        }

            public class Activity7 {
                public static void main(String[] args) {
                    MountainBike mb = new MountainBike(4, 50, 30);
                    System.out.println(mb.bicycleDesc());
                    mb.speedUp(20);
                    mb.applybrake(10);
                    mb.seatHeight(25);
                }
            }
