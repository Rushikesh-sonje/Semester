import java.util.Arrays;

public class relatriveSortArray {
    public static void main(String[] args) {
        int [] arr1 ={2,3,1,3,2,4,6,7,9,2,19};
        int [] arr2 = {2,1,4,3,9,6};

//        Output: [2,2,2,1,4,3,3,9,6,7,19]

        // find out maximum element in an array
        int max = Integer.MIN_VALUE;
        for(int i : arr1){
            max = Math.max(max,i);
        }
        System.out.println(max);

        int []freq = new int[max +1];

        // make a frequency array
        for(int i : arr1){
            freq[i]++;
        }
        System.out.println(Arrays.toString(freq));

        int i=0;
        for(int num : arr2){
            while(freq[num]>0){
                arr1[i] = num;
                freq[num]--;
                i++;
            }
        }
        System.out.println(Arrays.toString(arr1));




//        int k=0;
//        for(int i=0;i<arr1.length;i++){
//            for(int j=0;j<freq[i];j++){
//                arr1[k++] = i;
//            }
//        }
//        System.out.println(Arrays.toString(arr1));

    }
}
