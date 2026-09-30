package Searching;

public class LinearSearch {
    public void linearSearch(int[] arr,int key){
        int flag=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("Key is Found");
        }
        else{
            System.out.println("Key is not Found");
        }

    }
}
