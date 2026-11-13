package PatternSlidingWindow;

import java.util.Arrays;
//The time complexity of sliding window algo is n unlike the normal one which is n^2
public class AverageOfSubarraySlidingWindow {
    public static double[] findAverage(int k, int[] arr) {
        double[] result = new double[arr.length-k+1];
        int windowStart = 0;
        double windowSum = 0;
        double windowAverage = 0;
        for(int windowEnd = 0; windowEnd < arr.length; windowEnd++){
            windowSum+=arr[windowEnd];
//the core concept here is we are calculating the average by each window where the size
// of the window is k then after window size reaches k we reduce the first element and add
// the next item from the window size (do the same thing till the end of the array)
            if(windowEnd >= k-1) {
                windowAverage=windowSum/k;
                result[windowStart] = windowAverage;
                windowSum-=arr[windowStart];
                windowStart++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,2,6,-1,4,1,8,2};
        double[] output = findAverage(5,arr);
        System.out.println(Arrays.toString(output));
    }
}
