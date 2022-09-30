package finlaKey;


final class Dummy//not create sub class
{
	
}
class Demo{
	public final void someFunction()
	{
		
	}
	class moredemo extends Demo
	{
//		public void someFunction()//error bec final function
//		{
//			
//		}
	}
}

public class Example {
	
	private final int x=1 ;//final instance variable
	private final static int y=2;//final static
	
	
	public void fun()
	{
		final int k=3;//final local variable
		
	}
	public static void main(String[] args)
	{
		Example e1=new Example();
	}

}
