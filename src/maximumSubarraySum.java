import java.util.ArrayList;

public class maximumSubarraySum {

    public static void bruteForce(int []arr){
        int max  = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum =0;
                for(int k=i;k<j;k++){
                    sum +=arr[k];
                    max = Math.max(max,sum);
                }
            }
        }
        System.out.println(max);
    }

    public static void betterForce(int[] arr) {

        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum =0;
            for(int j=i;j<arr.length;j++){
                sum +=arr[j];
                max = Math.max(max,sum);
            }
        }
        System.out.println(max);
    }

    public static void optimaForce(int[] arr) {

        // known as kedan's algorithm
        int max = Integer.MIN_VALUE;
        int sum =0;

        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if(sum>max){
                max = sum;
            }
            if(sum<0){
                sum = 0;
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
//        int []arr = {-2,-3,4,-1,-2,1,5,-3};
//        int []arr = {-2,-3,5,8,-1,};
//        int []arr = {4,5,0,-2,-3,1};
//        printAllTheSubarray(arr);
        int []arr ={2,8,2,6,-6,3,2};
//        bruteForce(arr);
//        betterForce(arr);
        optimaForce(arr);

    }

    public static void printAllTheSubarray(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                System.out.print("[");
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println("]");
            }
        }
    }


    }



