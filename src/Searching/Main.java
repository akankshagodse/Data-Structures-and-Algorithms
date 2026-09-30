package Searching;

public class Main {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        LinearSearch l1=new LinearSearch();
        l1.linearSearch(arr,40);

        int[] arr1={10,30,50,70,90};
        BinarySearch b1=new BinarySearch();
        b1.binarySearch(arr1,70);
    }
}