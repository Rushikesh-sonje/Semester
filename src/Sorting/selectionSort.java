package Sorting;

import java.util.Arrays;



public class selectionSort {

    public static void swap(int []arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static int getmaximum(int []arr,int first,int largest){
        int max = first;
        for(int i=first;i<=largest;i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int []arr = {3,5,2,1,4,7,6,8,9};

        // first find largest element
//        swap with its correct location
        for(int i=0;i<arr.length;i++){

            int largest = arr.length-i-1;
            int a = getmaximum(arr,0,largest);
            swap(arr,a,largest);
        }

        System.out.println(Arrays.toString(arr));
    }
}
