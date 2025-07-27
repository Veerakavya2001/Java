
//Interface with default and static methods
interface Logger {
 // Default method: Can be overridden
 default void logInfo() {
     System.out.println("Logging info from Logger (default)");
 }

 
 static void logError() {
     System.out.println("Logging error from Logger (static)");
 }
}

//Class implementing the interface
class AppLogger implements Logger {

 public void logInfo() {
     System.out.println("Logging info from AppLogger (overridden)");
 }
}

public class Interface {
 public static void main(String[] args) {
     AppLogger logger = new AppLogger();

     logger.logInfo();      
    
     Logger.logError();     
 }
}

