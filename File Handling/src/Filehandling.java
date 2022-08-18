import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Filehandling {
	public static void main(String args[]) throws FileNotFoundException, IOException{
		System.out.println("Please select one of the below operations");
		System.out.println(" w for Write Mode");
		System.out.println("r for Read Mode");
		System.out.println("a for append Mode");
		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine();
		if(s.equalsIgnoreCase("r"))
		{
			new FReading();
		}
		else if (s.equalsIgnoreCase("w")||s.equalsIgnoreCase("a"))
		{
			writingToFile(s);
		}
		else
		{
			System.out.println("Sorry!!!BetterLuck next time");
		}
		sc.close();
	}
	public static void writingToFile(String s) {
		Scanner sc = null;
		try
		{
			String source="";
			File f = new File("file2.txt");
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			FileWriter f1 =null;
			if(s.equalsIgnoreCase("w"))
			{
				f1=new FileWriter(f,false);
				System.out.println("CAUTION >>Please Understand it will Overwrite the Content of the file");
				System.out.println("Type No to exit");
				System.out.println("Do you want to process:type Yes");
				sc=new Scanner(System.in);
				String s1=sc.nextLine();
				if(s1.equals("no"))
					System.exit(0);
				System.out.println("Write Stop when you finish writing file");
				f.delete();
				f.createNewFile();
				while(!(source=bf.readLine()).equalsIgnoreCase("stop"))
				{
					f1.write(source+System.getProperty("line.separator"));
				}
				sc.close();
			}
			//For appending the Content
			else
			{
				f1=new FileWriter(f,true);
				System.out.println("Write stop when you finish appending file");
				while(!(source=bf.readLine()).equalsIgnoreCase("stop"))
				{
					f1.append(source+System.getProperty("line.separator"));
				}
			}
			sc.close();
		}
		catch(Exception e) {
			System.out.println("Error");
			e.printStackTrace();
		}
	}
		

}
	class FReading{
		public static String str="";
		public FReading() {
			try {
				File f5=new File("file2.txt");
				if(!f5.exists())
					f5.createNewFile();
				FileReader f1= new FileReader(f5);
				BufferedReader bf = new BufferedReader(f1);
				//For reading till end
				while((str=bf.readLine())!=null) {
					System.out.println(str);			
				}
				f1.close();
			}
			catch(Exception e) {
				System.out.println("Error");
				e.printStackTrace();
			}
		}
		
		}
