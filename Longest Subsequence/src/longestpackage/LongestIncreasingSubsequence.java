package longestpackage;

public class LongestIncreasingSubsequence {
	static int increasing_subsequence(int arr[],int arr_len) {
		int seq_arr[]=new int[arr_len];
		int i,j,max=0;
		for(i=0;i<arr_len;i++)
			seq_arr[i]=1;
		for(i=0;i<arr_len;i++)
			for(j=0;j<i;j++)
				if(arr[i]>arr[j]&&seq_arr[i]<seq_arr[j]+1)
					seq_arr[i]=seq_arr[j]+1;
		for(i=0;i<arr_len;i++)
			if(max<seq_arr[i])
				max=seq_arr[i];
		return max;
		
		
	}
	public static void main(String args[]) {
		int arr[]= {16,21,29,10,66,37,81,98};
		int arr_len=arr.length;
		
		System.out.println("The length of the longest increasing Subsequence is "+increasing_subsequence(arr,arr_len));
		
	}

}
