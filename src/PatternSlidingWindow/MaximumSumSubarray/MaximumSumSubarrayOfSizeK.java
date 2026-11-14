package PatternSlidingWindow.MaximumSumSubarray;
//The time complexity of this algo is n*k which is not efficient
//Its simply using bruteforce by using 2 for loops and going through every element
public class MaximumSumSubarrayOfSizeK {
    public static int findMaxSumArray(int k, int[] arr) {
        int maxSum = -1;
        for(int i = 0;i < arr.length - k; i++){
            int sum = 0;
            for(int j = i; j < i+k; j++) {
                sum+=arr[j];
            }
            if(sum > maxSum) {
                maxSum = sum;
            }
        }

        return maxSum;
    }

    public static void main (String[] args) {
        int result = findMaxSumArray(3, new int[] {2,1,5,1,3,2});
        int result2 = findMaxSumArray(2, new int[] {2,3,4,1,5});
        System.out.println(result);
        System.out.println(result2);
    }
}
