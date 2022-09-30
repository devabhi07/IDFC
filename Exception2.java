package finlaKey;

public class Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			int a[] =new int[5];
			a[6]=9;
			
		}
		catch(Exception e) {
			System.out.println("Array Index is Out of Bounds"+e);
		}

	}

}
