
public class Task7b {
    // Instance variables (not initialized)
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean bool;
    String str; // reference type

    // Method to print default values
    void printDefaults() {
        System.out.println("byte default: " + b);
        System.out.println("short default: " + s);
        System.out.println("int default: " + i);
        System.out.println("long default: " + l);
        System.out.println("float default: " + f);
        System.out.println("double default: " + d);
        System.out.println("char default: '" + c + "'"); // shows as empty
        System.out.println("boolean default: " + bool);
        System.out.println("String (reference) default: " + str);
    }




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task7b obj = new Task7b();
        obj.printDefaults();

	}

}
