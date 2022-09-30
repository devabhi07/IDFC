package finlaKey;

class Table1
{
	 void tab(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+" x "+i+" = " +n*i);		
				// try
				// {
				// 	Thread.sleep(400);
					
				// }
				// catch(Exception e)
				// {
					
				// }
		}

	}
}
class First extends Thread{  
Table1 t;  
First(Table1 t){  
this.t=t;  
}  
synchronized  public void run(){  
t.tab(9);    // here is the input example : 9
}  

}  
//class _2nd extends Thread{  
//Table1 t;  
//_2nd(Table1 t){  
//this.t=t;  
//}  
//public void run(){  
//t.tab(5);  // here is the 2nd input example : 5
//}  
//
//}  
class Table
{
	public static void main(String ar[])
	{
		Table1 tab=new Table1();
		First obj=new First(tab);
	//	_2nd o=new _2nd(tab);
		obj.start();
		//o.start();
	}
}

