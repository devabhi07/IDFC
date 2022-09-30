package finlaKey;

class A
{
	 void tableShow(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+" x "+i+" = " +n*i);
		}
	}
}
class B extends Thread{
	A table;
	B(A table){
		this.table=table;
	}
	synchronized  public void run(){ 
		System.out.println("Table print");
		table.tableShow(2);
	}
}
public class ThreadUsingTable {

	public static void main(String[] args)
	{
		A tableShow=new A();
		B obj=new B(tableShow);
	
		obj.start();
		
	}

}
