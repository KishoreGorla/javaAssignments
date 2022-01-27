package kishore;

class Animal {
	 private void eat()
	 {
		 System.out.println("Animal eats");
	 }
}
class Dog extends Animal
{
	 public void bark()
	 {
		 System.out.println("Dog barks");
	 }
}
public class Singleton {
	 public static void main (String args[])
	 {
		 Dog d1=new Dog();
		 d1.bark();
		//d1.eat(); we cannot be inherited singletone class.
		 
		 
		 
		 
	 }
	 
}
 






















