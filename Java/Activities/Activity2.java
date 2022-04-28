package activities;

public class Activity2 {

    public static void main(String[] args) {

        int[] numArray = {10, 77, 10, 54, -11, 10};
        int searchNumber = 10;
        int checkSum = 30;

        System.out.println("The result is " + result(searchNumber, checkSum, numArray));

    }

    public static boolean result(int searchNumber, int checkSum, int [] numArray) {
        int tempSum = 0;
        for (int n : numArray) {
            if (n == searchNumber) {
                tempSum = tempSum + searchNumber;
            }

            if (tempSum > checkSum) {
              break;
            }
        }
        System.out.println("The Sum is " + tempSum);
        return tempSum == checkSum;
    }
}

