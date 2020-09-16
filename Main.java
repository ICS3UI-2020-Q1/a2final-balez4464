import java.util.Scanner;
/**
 *This program calcualtes the cost of a customers pizza based on its diameter and size
 * @author Zachary Balean
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Creates a Scanner
    Scanner input = new Scanner(System.in);

    //Constants for mandatory pizza charges
    final double LABOUR_PRICE = 0.75;
    final double OVEN_PRICE = 0.99;
    final double INGREDIENTS_PRICE = 0.50; 
    final double TAX_PRICE = 0.13;

    //Messgae for customers
    System.out.println("What is the size of the pizza (in cm):");

    //Variable for customers pizza diameter
    double pizzaSize = input.nextDouble();
    
    //Calculates subtotal for customer and tell them subtotal
    double costNoTax = (pizzaSize * INGREDIENTS_PRICE + OVEN_PRICE + LABOUR_PRICE);
    System.out.println("Subtotal: " + "$" + costNoTax);

    //Calculates tax and tells cost
    double taxCost = (costNoTax * TAX_PRICE);
    System.out.println("Taxes: " + "$" + taxCost);
    
    //Calculates and tells costumer their total price with tax
    double costWithTax = (costNoTax + taxCost);
    System.out.println("Total: " + "$" + costWithTax);

    //Determines which message to give user based on diameter of pizza
    if(pizzaSize >= 1 && pizzaSize <= 20){
      System.out.println("We are going to make you a cute little pizza!");
    } else if(pizzaSize >= 21 && pizzaSize <= 40){
      System.out.println("This will be delicious!");
    } else {
      System.out.println("Woah, big pizza! You might need a truck to get this home!");
    }

  }
}
