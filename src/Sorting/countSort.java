package Sorting;

import java.util.Arrays;

public class countSort {
    public static void main(String[] args) {
        int []arr ={3,5,7,5,4,2,1,4,3,6,7,8};

        // finding maximum
        int max = Integer.MIN_VALUE;
        for(int i:arr){
            max = Math.max(max,i);
        }
        System.out.println("Max :"+max);

        // making freq array of size max+1
        int freq[] = new int [max+1];

        // storing freq of elemnts in arr to freq array
        for(int i:arr){
            freq[i]++;
        }
        // printing freq array
        System.out.println(Arrays.toString(freq));
//        System.out.println("hi");

        int k=0;
        for(int i=0;i<=max;i++){
            for(int j=0;j<freq[i];j++){
                arr[k++] = i;
            }
        }

        System.out.println(Arrays.toString(arr));




    }
}
