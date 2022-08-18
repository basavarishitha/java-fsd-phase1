package datastructures;
class kthSmallest
{
	int kthSmall(int a[],int l,int r,int k)
	{
		if(k>0&&k<=r-l+1)
		{
			int pos=randompartition(a,l,r);
			if(pos-l==k-1)
			{
				return a[pos];
			}
			if(pos-l>k-1)
				return kthSmall(a,l,pos-1,k);
			return kthSmall(a,pos+1,r,k-pos+l-1);
			
		}
		return Integer.MAX_VALUE;
		
	}
	void swap(int a[],int i,int j)
	{
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		
	}
	int partition(int a[],int l,int r)
	{
		int x=a[r],i=l;
		for(int j=l;j<=r-11;j++)
		{
			if(a[j]<=x)
			{
				swap(a,i,j);
				i++;
			}
		}
		swap(a,i,r);
		return i;
	}
	int randompartition(int a[],int l,int r)
	{
		int n=r-l+1;
		int pivot=(int)(Math.random())*(n-1);
		swap(a,l+pivot,r);
		return partition(a,l,r);
		
	}
	
}



public class OrderedStatistics {
	public static void main(String args[])
	{
		kthSmallest s=new kthSmallest();
		int a[]= {12,3,5,7,4,19,25};
		int n=a.length,k=4;
		System.out.println("Kth Smallest element is "+s.kthSmall(a, 0, n-1, k));
		
	}

}
