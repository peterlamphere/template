import java.util.*;

class ChangeCounter {
  public static void main(String[] args) {
    System.out.println("Please enter how many pennies you have: ");
    Scanner scan = new Scanner(System.in);
    int pennies = scan.nextInt();

    int quarters = pennies / 25;
    int dimes = (pennies %= 25) / 10;
    int nickels = (pennies %= 10) / 5;
    pennies %= 5

    System.out.println("You have " + quarters + " quarter(s), " + dimes + " dime(s), " + nickels + " nickel(s), and " + pennies + " pennie(s)!");

  }
}