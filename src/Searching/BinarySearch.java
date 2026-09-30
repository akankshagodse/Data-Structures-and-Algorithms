package Searching;

public class BinarySearch {

    public void binarySearch(int[] arr,int key){
        int low=0;
        int high=arr.length-1;
        while(low<=high){

            int mid=(low+high)/2;
            if(arr[mid]==key){
                System.out.println("Key is Found");
                return;
            }
            else if(arr[mid]<key){
                low=mid+1;
            }
            else{
                high=mid-1;
            }


        }
        System.out.println("Key is not Found");
    }
}
