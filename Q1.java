import java.io.*;

class Q1
{
	public static void main(String x[])
	{
	File f = new File("D:/java/Acadview/10-9-18/abc.txt");	
	
		System.out.println();
		try
		{
			FileInputStream fin = new FileInputStream(f);
			int i;
			
			i = fin.read();
				while(i != -1)
				{	
				System.out.print((char)i);
				i = fin.read();
				}
			System.out.println();	
			fin.close(); 	
		}
		
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}