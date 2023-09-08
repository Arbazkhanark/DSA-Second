//{ Driver Code Starts
import java.util.*;
import java.lang.Math;

class Sorting
{
	
	static void printArray(int arr[],int size)
	{
		int i;
		for(i=0;i<size;i++)
		System.out.print(arr[i]+" ");
	    System.out.println();
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
		
			for(int i=0;i<n;i++)
			a[i]= sc.nextInt();
			
			 new Solution().insertionSort(a,n);
			 printArray(a,n);
			
		t--;
		}
		
	}
}
// } Driver Code Ends


class Solution{
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n){
      
      for(int i=1;i<arr.length;i++){  // i Maintain UnSorted Array
          int j=i-1;
          int temp=arr[i];            // Hold the current value to swap if condition match
          while(j>=0 && temp<arr[j]){   // j Maintain Sorted Array
              arr[j+1]=arr[j];
              j--;
          }
          arr[j+1]=temp;      // place the current value
      }
  }
}