
public class Bubblesort {
	void  bubblesort(int a[]) {
		int n= a.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++) {
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
	}
		

}
	void display(int a[])
	{
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]+"");
	}
		//System.out.println(+a[3]);//
	}
	public static void main(String args[]) {
		Bubblesort b= new Bubblesort();
		int a[]= {5,1,4,2,8};
		b.bubblesort(a);
		b.display(a);
	}
}
