package Sorting;

import java.util.Arrays;

public class cycleSort {

    public static void swap(int[]arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int []arr = {3,5,2,1,4,7,6,8,9};
        int i=1;
        while(i<arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else{
                i++;
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
