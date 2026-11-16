package PatternSlidingWindow.SmallestSubArrayWithGivenSum;
//Time complexity for this algo is n
//This method uses sliding window pattern, where it manages
//to find the minimum sum > s by shrinking the window as long
//as it is greater than s if not move to the next window till the end of the array
public class SmallestSubArraySlidingWindow {
    public static int findLengthSmallestSubarray(int s, int[] arr) {
        int minLength = arr.length+1;
        int windowStart = 0;
        int windowSum = 0;

        for(int windowEnd = 0;windowEnd<arr.length; windowEnd++) {
            windowSum+=arr[windowEnd];
            //Shrink the window as small as possible until windowSum is smaller than s
            while(windowSum >= s) {
                minLength = Math.min(windowEnd-windowStart+1,minLength);
                windowSum-=arr[windowStart];
                windowStart++;
            }
        }


        return (minLength>arr.length)?0:minLength;
    }

    public static void main(String[] args) {
        int result = findLengthSmallestSubarray(7,new int[] {2,1,5,2,3,2});
        int result2 = findLengthSmallestSubarray(7,new int[] {2,1,5,2,8});
        int result3 = findLengthSmallestSubarray(8,new int[] {3,4,1,1,6});
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
    }
}
