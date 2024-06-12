package Sorting;

import java.util.Arrays;

public class bubbleSort {

    public static void swap(int []arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void main(String[] args) {
        int []arr = {3,5,2,1,4,7,6,8,9};

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length-i;j++){
                if(arr[i]>arr[j]){
                    swap(arr,i,j);
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
