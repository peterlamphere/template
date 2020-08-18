// imports class libraries, including for Scanner to do input
import java.util.*; 
// begin class
// You should change the name of the class to something appropriate
class Main {  
  // begin main method
  public static void main(String[] args) { 
    // Create a Scanner object called "scan" to get input from the console
    Scanner scan = new Scanner(System.in); 
    // prompt user for their name
    System.out.println("Please enter your name:"); 
    // Gets users name and puts in the "name" variable
    String name = scan.nextLine();
    // Says hello
    System.out.println("Hello, " + name); 
  } // end main method
} // end class