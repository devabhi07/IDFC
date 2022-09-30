package finlaKey;


public class Multithreading2 implements Runnable {
	
	public void run() {
		System.out.println("Abhia");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multithreading2 t=new Multithreading2();
		Thread r=new Thread(t);
		r.start();
		
	   
		

	}

}