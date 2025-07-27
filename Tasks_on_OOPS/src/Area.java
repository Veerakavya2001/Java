abstract class shape{
	abstract double area();
	
}
class circle extends shape{
	 double radius;

	    circle(double radius) {
	        this.radius = radius;
	    }

	    double area() {
	        return Math.PI * radius * radius;
	    }
}
class Rectangle extends shape{
	
	double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }

	
}
public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       circle c1 = new circle(5);
	        Rectangle  r1 = new Rectangle(4, 6);

        System.out.println("Area of Circle: " + c1.area());
        System.out.println("Area of Rectangle: " + r1.area());

	}

}
