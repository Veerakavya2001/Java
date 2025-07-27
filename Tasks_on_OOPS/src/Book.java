
public class Book {
	String title;
	String author;
	double price;
	void displayDetails() {
		
		System.out.println("the title of the book:"+ title);
		System.out.println("the author of the book: "+ author);
		System.out.println("the cost of the book: "+price);
		System.out.println("-------------------------");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book obj1=new Book();
		obj1.title="Java Course";
		obj1.author="Herbert Schildt";
		obj1.price=1500;
			
		Book obj2=new Book();
		obj2.title="Python Course";
		obj2.author="Guido van ";
		obj2.price=1000;
		
		obj1.displayDetails();
		obj2.displayDetails();
		
		
		

	}

}
