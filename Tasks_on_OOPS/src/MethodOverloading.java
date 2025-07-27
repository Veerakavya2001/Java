class Calculator {
	int add(int a, int b) {
        return a + b;
    }
	double add(double x,double y ) {
		return x+y;
		
	}
	String add(String a, String b) {
        return a + b;
    }
}


public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator C1=new Calculator();
		 System.out.println("int add: " +C1.add(5, 3));

	        // Testing double addition
	        System.out.println("double add: " + C1.add(2.5, 3.8));

	        // Testing string concatenation
	        System.out.println("String add: " + C1.add("Hello, ", "World!"));

	}

}
