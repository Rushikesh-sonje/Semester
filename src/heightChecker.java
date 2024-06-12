import java.util.Arrays;

public class heightChecker {
    public static void main(String[] args) {
        int []arr = {1,1,4,2,1,3};
        int []sortedArr = Arrays.copyOf(arr,arr.length);   // copying by reference .

        System.out.println(Arrays.toString(arr));
        Arrays.sort(sortedArr);
        System.out.println(Arrays.toString(sortedArr));

//        for(int i=0;i<sortedArr.length;i++){
//            System.out.print(sortedArr[i]+" ");
//        }

        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != sortedArr[i]){
                count++;
                System.out.println(count);
            }
        }
        System.out.println(count);
    }
}
