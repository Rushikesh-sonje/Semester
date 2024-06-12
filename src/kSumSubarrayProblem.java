

public class kSumSubarrayProblem {
    public static void main(String[] args) {
        int []arr ={2,8,2,6,-6,3,2};
        int val=5;
        int sum;
        int count =0;
        int max = Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++){
           for(int j=i;j<arr.length;j++){
               sum=0;
               System.out.print("[");
               for(int k=i;k<=j;k++){
                    sum+=arr[k];
                   System.out.print(arr[k]+" ");
                    if(sum==val){
                        count++;
                    }
               }
               System.out.println("]");
               System.out.println("sum : "+sum);
               System.out.println("count : "+count);
           }
       }

        System.out.println(count);
    }
}
