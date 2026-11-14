package PatternSlidingWindow.MaximumSumSubarray;
// the time complexity of this algo is n
// We are only iterating through the array once, we are using
//sliding windows that are the size of k, when window size reaches k
// we deduct the window start item and add the next item from the last
public class MaximumSumSubarraySlidingWindow {
    public static int findMaxSumArray(int k, int[] arr){
        int maxSum = -1;
        int windowStart = 0;
        int windowSum = 0;

        for(int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum+=arr[windowEnd];
            if(windowEnd >= k-1) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum-=arr[windowStart];
                windowStart+=1;
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
