class Solution {
    public int maxArea(int[] arr) {
        int height=0;
        int distance=0;
        int area=0;
        int max=0;
        int start=0;
        int end=arr.length-1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[start]<=arr[end]){
                height=arr[start];   //2,
                distance=end-start;  //6,
                area=height*distance; // 12,
                
                start++;
            }else{
                height=arr[end];
                distance=end-start;
                area=height*distance;
                
                end--;
            }
            
            
            
            if(max<area){
                max=area;
            }

        }
        return max;
    }
}