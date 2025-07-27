
abstract class Appliance {
 abstract void turnOn(); // abstract method
}

//Interface
interface Connectable {
 void connect(); // interface method
}

//Concrete Class: SmartTV
class SmartTV extends Appliance implements Connectable {

 // Implement abstract method from Appliance
 public void turnOn() {
     System.out.println("SmartTV is turning on.");
 }

 // Implement method from Connectable interface
 public void connect() {
     System.out.println("SmartTV is connecting to WiFi.");
 }
}

//Main class to test
public class AbstractAndInterface {
 public static void main(String[] args) {
     SmartTV tv = new SmartTV();

     tv.turnOn();   
     tv.connect();  
 }
}

