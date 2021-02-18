import java.util.Scanner;
/**
 * This is the hello world program
 * Evan Schedewitz
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
   //Ask user for their name
   System.out.println("Please enter your name:");
   // creating a scanner for user input
    Scanner input = new Scanner(System.in);
    // Declare and initalize the name varible 
    String name = input.nextLine();
    //say hello to the user
    System.out.println("hello " + name);
    //ask the user when they were born
    System.out.println("Please enter the year you were born:");
    //create the varible to store the birth year
    int birthYear = input.nextInt();
    //caclulate the approximate age
    int age = 2021 - birthYear;
    //tell user calculated age
    System.out.println("You are approximately " + age + " years old.");
  }
}
