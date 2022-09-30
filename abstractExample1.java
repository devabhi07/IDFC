package collections;




abstract class animal
{
	public abstract void sound();
}
//abstract use in key word extends
class Dog extends animal

{
	public void sound()
	{
		System.out.println("Dog is Barking ");
	}
	
}
class Lion extends animal
{
	public void sound()
	{
		System.out.println("Lion is Roar");
	}
	
}








public class abstractExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d= new Dog();
		Lion l=new Lion();
		d.sound();
		l.sound();

	}

}
