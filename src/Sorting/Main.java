package Sorting;

public class Main {
    public static void main(String[] args) {

        int[] arr = {20, 10, 30, 50, 40};

        BubbleSort b1 = new BubbleSort();

        b1.bubbleSort(arr);
        System.out.print("Bubble Sort: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        int[] arr1 = {300, 200, 150, 110, 400};

        SelectionSort s1 = new SelectionSort();

        s1.selectionSort(arr1);
        System.out.print("Selection Sort: ");
        for(int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println();

        int[] arr2 = {12,87,45,32,10,5,39};

        InsertionSort i1 = new InsertionSort();

        i1.insertionSort(arr2);
        System.out.print("Insertion Sort: ");
        for(int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}