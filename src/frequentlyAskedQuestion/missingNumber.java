package frequentlyAskedQuestion;

public class missingNumber {
    public static void main(String[] args) {
//        int []arr ={5,3,2,4,1,7};
        int []arr ={3,4,1};
        int sumOfElements = 0;
        for(int i : arr){
            sumOfElements += i;
        }
        System.out.println(sumOfElements);

        int expectedSum = 0;
        for(int i=1;i<=arr.length+1;i++){
            expectedSum += i;
        }
        System.out.println(expectedSum);
        int ans = expectedSum-sumOfElements;
        System.out.println("Missing number is : "+ans);
    }
}
