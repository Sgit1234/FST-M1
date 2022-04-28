package activities;

import java.util.Arrays;

public class Activity4 {

    public static void main(String[] args) {
        int cardSortArray[] = {4, 3, 1, 10, 12, 2, 5, 6, 8};
        System.out.println("The card order before sorting is " + Arrays.toString(cardSortArray));
        ascendingSort(cardSortArray);
        System.out.println("The card order after sorting is " + Arrays.toString(cardSortArray));
    }

    static void ascendingSort(int cardArray[]) {
        int i;
        int size = cardArray.length;
        for (i = 1; i < size; i++) {
            int key = cardArray[i];
            int j = i - 1;

            while (j >= 0 && key < cardArray[j]) {
                cardArray[j + 1] = cardArray[j];
                --j;
            }

            cardArray[j + 1] = key;
        }
    }
}