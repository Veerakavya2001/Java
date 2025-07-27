
class vehical{
	String Brand;
	double speed;
}
class car extends vehical{
	void showDetails() {
		Brand = "Audi";
		speed=120;
		System.out.println("Brand: " + Brand +",speed :"+speed+"km/h");
	}}
	class Bike extends vehical{
		void showDetails() {
			Brand = "Yamaha";
			speed=100;
			System.out.println("Brand: " + Brand +",speed :"+speed+"km/h");
		}
	
	
}
public class VehicalSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car C1=new car();
		Bike B1=new Bike();
		C1.showDetails();
		B1.showDetails();
	
		
		

	}

}
