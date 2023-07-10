// Write a Program that takes two numbers as input and display the product of two numbers.

class Main{
    public static void main(String[] args) {
        int arr[]={1,3,4,4,6,1,7,8};
        
        int remove=3;
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=remove){
                arr[index]=arr[i];
                index++;
            }
        }
        
        for (int y : arr) {
            System.out.println(y);
        }
    }
}