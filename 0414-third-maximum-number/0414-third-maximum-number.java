class Solution {
    public int thirdMax(int[] arr) {
        long largest = Long.MIN_VALUE;
        long secondLargest = Long.MIN_VALUE;
        long thirdLargest = Long.MIN_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == largest || arr[i] == secondLargest || arr[i] == thirdLargest) {
                continue;  /// This case is for duplicacy
            }
            
            if (arr[i] > largest) {
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                thirdLargest = secondLargest;
                secondLargest = arr[i];
            } else if (arr[i] > thirdLargest && arr[i] != secondLargest) {
                thirdLargest = arr[i];
            }
        }
        
        if (thirdLargest == Long.MIN_VALUE) {
            return (int)largest; // Third distinct maximum doesn't exist, return the maximum
        }
        
        return (int)thirdLargest;
    }
}