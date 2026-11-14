package PatternSlidingWindow.AverageOfSubarray;

import java.util.Arrays;
// The time complexity for this algorithm is n*k which is not effective,
// its fixed using sliding window algo
public class AverageOfSubarrayOfSizeK {
    public static double[] findAverage(int k, int[] arr){
        double[] result = new double[arr.length-k+1];
        for(int i=0;i<=arr.length-k;i++){
            double sum = 0;
            for(int j=i;j<i+k;j++){
                sum+=arr[j];
            }
            result[i] = sum/k;
        }

        return result;
    }

    public static void main(String[] args){
        int[] myArray = {1,3,2,6,-1,4,1,8,2};
        double[] myResult = findAverage(5,myArray);
        System.out.println(Arrays.toString(myResult));
    }
}
