package finlaKey;
 




import java.io.FileInputStream;


public class FileIstream{
	public static void main(String[] args)
	{
		try{
			FileInputStream fs=new FileInputStream("abc.txt");
			
			for(int i=fs.read();i!=-1;i=fs.read()){
				System.out.print((char)i);
				
		}
		fs.close();
		
		
	}
	catch(Exception e){
		System.out.println(e);
	}
}
}