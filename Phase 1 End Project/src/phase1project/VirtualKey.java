package phase1project;
import java.io.File;
import java.util.Scanner;
import java.util.Arrays;

public class VirtualKey {
	public static void main(String args[])
	{
		System.out.println("Welcome to the Virtual Repository");
		boolean isPresent = true;
		while(isPresent) {
			System.out.println("**Main Menu**");
			System.out.println("1.Retrive Current FileName in Ascending Order\n2.Business Level Operation Menu\n3.Exit\n");
			System.out.println("Enter your option: ");
			@SuppressWarnings("resource")
			Scanner s =new Scanner(System.in);
			int option =s.nextInt();
			switch(option)
			{
			case 1:
				System.out.println("The files are retriving in Ascending Order");
				retrive();
				break;
			case 2:
				System.out.println("Business Level Operation Menu");
				business();
				break;
			case 3:
				isPresent =false;
				System.out.println("Closing Your Application...\n Thank you!");
				break;
			default :
				System.out.println("Incorrect Option!! Check it once");
				break;
					
			}		
			
		}
	}
	public static void retrive() {
		String path ="C:\\Users\\hp\\OneDrive\\Desktop\\Mphasis FSD\\Project Phase1";
		File file= new File(path);
		file.listFiles();
		File downloadDir[]=file.listFiles();
		Arrays.sort(downloadDir);
		for(File e : downloadDir) {
			if(e.isFile()) {
				System.out.println("File :"+e.getName());
			}
		
			else if(e.isDirectory()) {
			System.out.println("This is my folder: "+e.getName());
		}
		
		
	}
	}
	public static void business()
	{
		String path="C:\\Users\\hp\\OneDrive\\Desktop\\Mphasis FSD\\Project Phase1";
		File file =new File(path);
		boolean type = true;
		while(type) {
			System.out.println("Enter your operations:\t");
			System.out.println("1.Add a file to a directory\n 2.Delete a file from the exisiting directory\n 3. Searching a file and showing its content\n 4. Exit");
			Scanner obj=new Scanner(System.in);
			int choice =obj.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter a file name");
				String name = obj.next();
				if(new File(file,name).exists()) {
					System.out.println("File already exists..");
					
				}
				else {
					File folder1 = new File(file,name);
					folder1.mkdir();
					if(new File(file,name).exists()) {
						System.out.println("File added successfully");
					}
					
				}
				break;
			case 2:
				System.out.println("Enter a file name: ");
				String name1=obj.next();
				boolean folder2=new File(file,name1).exists();
				if(folder2==true)
				{
					File folder3=new File(file,name1);
					folder3.delete();
					System.out.println("File successfully deleted");
				}
				else
				{
					System.out.println("File does not exist");
				}
				break;
			case 3:
				String StringName="";
				try {
					String[] flist = file.list();
					int flag=0;
					System.out.println("Enter FileName ");
					StringName=obj.next();
					if(flist==null) {
						System.out.println("Empty Directory");
					}
					else
					{
						for(int i=0;i<flist.length;i++)
						{
							String filename=flist[i];
							if(filename.equalsIgnoreCase(StringName)) {
								System.out.println(filename+"Found");
								flag=1;
								break;
								
							}
						}
					}
					if(flag==0) {
						System.out.println("File not found");
					}
				}
				catch(Exception e) {
					System.out.println("Error");
				}
				break;
			case 4:
				type=false;
				System.out.println("Returning to main menu!");
				break;
				default:
					System.out.println("Incorrect Option!!");
			}
		}
	}

	
}
