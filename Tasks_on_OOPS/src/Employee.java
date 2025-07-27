
 class main {
	static int count=0;
	String name;
	main(){
		count++;
		
	}
	static void  CountDetails() {
		System.out.println("count:"+ count);
		
	}
	
}
	public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		main e1=new main();
		main e2=new main();
		main e3=new main();
		main e4=new main();
		main.CountDetails();

	}

}
