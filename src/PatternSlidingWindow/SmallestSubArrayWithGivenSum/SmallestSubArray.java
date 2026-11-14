package PatternSlidingWindow.SmallestSubArrayWithGivenSum;
//time complexity for this algo is n^2 which is not effective
//The code is comparing every sub array sum using the nested loop
//and finding the smallest length based on the sum
public class SmallestSubArray {
    public static int findLengthSmallestSubarray(int s, int[] arr) {
        int smallestArrayLength = arr.length+1;
        for(int i=0;i<arr.length;i++){
            int arrLength = 1;
            int sum = arr[i];
            if(sum >= s ) {// happens only if there is an element of the array > s
                return 1;
            }

            for(int j=i+1;j<arr.length;j++){
                sum+=arr[j];
                arrLength++;
                if(sum >= s && arrLength < smallestArrayLength){
                    smallestArrayLength = arrLength;
                }
            }

        }

        return (smallestArrayLength > arr.length)? -1: smallestArrayLength;
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
