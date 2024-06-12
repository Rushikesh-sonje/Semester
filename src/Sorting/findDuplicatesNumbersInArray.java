package Sorting;

import java.util.*;

public class findDuplicatesNumbersInArray {

    public static void swap(int []arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int []arr = {4,3,2,7,8,2,3,1};

        int i=0;
        while(i<arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }

        System.out.println(Arrays.toString(arr));

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int j=0;j<arr.length;j++){
            if(arr[j] != j+1){
                list1.add(arr[j]);
                list2.add(j+1);
            }
        }

        System.out.println("Duplicates Number : "+list1);
        System.out.println("missing Number : "+list2);
    }
}
