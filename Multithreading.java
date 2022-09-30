package finlaKey;

public class Multithreading extends Thread {
	
	public void run() {
		System.out.println("Abhia");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multithreading t=new Multithreading();
	    t.start();//correact way
//		t.run();
		

	}

}
