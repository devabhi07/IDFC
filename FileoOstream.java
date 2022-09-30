package finlaKey;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FileoOstream  {
	
	

	public static void main(String[] args) {
		try {
			
		
		// TODO Auto-generated method stub
		FileOutputStream fs= new FileOutputStream("abc.txt");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Text");
		String s=sc.next();
		byte b[] =s.getBytes();
		
		fs.write(b);
		System.out.println("go to the location");
		fs.close();
		}
		catch(Exception e) {
			System.out.println(e);
			
		}

	}

}
