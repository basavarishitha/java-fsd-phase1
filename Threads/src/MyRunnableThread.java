
public class MyRunnableThread implements Runnable
{
	public static int mycount=0;
	public MyRunnableThread() {
		
	}
	public void run() {
		while(MyRunnableThread.mycount<=10) {
			try {
				System.out.println("Expl Thread:"+(++MyRunnableThread.mycount));
				Thread.sleep(1000);
				
			}
			catch(InterruptedException e) {
				System.out.println("Exception in thread"+e.getMessage());
				
			}
		}
	}
	public static void main(String arga[]) {
		System.out.println("Starting Main Thread...");
		MyRunnableThread rt=new MyRunnableThread();
		Thread t= new Thread(rt);
		t.start();
		while(MyRunnableThread.mycount<=10) {
			try {
				System.out.println("Expl Thread:"+(++MyRunnableThread.mycount));
				Thread.sleep(1000);
				
			}
			catch(InterruptedException e) {
				System.out.println("Exception in thread"+e.getMessage());
				
			}
		}
		System.out.println("End of Main Thread...");
		
		
		
	}

	
}
