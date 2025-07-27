class Animal {
	void sound() {
		System.out.println("Animal Makes sounds");
	}
}
class Dog extends Animal{
	
	void sound() {
		System.out.println("Dog Barks");
	}
}
class cat extends Animal{
	void sound() {
		System.out.println("Cat meows");
	}
}
class cow extends Animal{
	void sound() {
		System.out.println("Cow moos");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1=new Dog();
		Animal a2=new cat();
		Animal a3=new cow();
		a1.sound();
		a2.sound();
		a3.sound();
		
		
		

	}

}
