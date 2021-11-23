/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author Youssef El-Guoshi
 * @version 18/11/2021
 */
public class StockApp {
   private InputReader reader;

   private StockList stock;

   /**
    * Constructor for objects of class StockApp
    */
   public StockApp() {
      reader = new InputReader();

      stock = new StockList();
      StockDemo demo = new StockDemo(stock);
   }

   /**
    *  Display a list of menu choices and execute
    *  the user's choice.
    */
   public void run() {
      boolean finished = false;

      while (!finished) {
         printHeading();
         printMenuChoices();

         String choice = reader.getString("Please enter your choice > ");

         finished = executeChoice(choice.toLowerCase());
      }
   }

   /**
    * Checks to see which command choice is equal to through a long if statement, which is then performed using
    * the methods from the StockList class.
    */
   private boolean executeChoice(String choice) {
      if (choice.equals("quit")) {
         return true;
      } else if (choice.equals("print")) {
         stock.print();
      } else if (choice.equals("add")) {
         int id = reader.getInt("Please enter ID: ");
         String name = reader.getString("Please enter name: ");
         stock.addProduct(id, name);
      } else if (choice.equals("buy")) {
         int id = reader.getInt("Please enter ID: ");
         int amount = reader.getInt("Please enter the amount: ");
         stock.buyProduct(id, amount);
         System.out.println("Product with ID, " + id + " has been successfully bought by " + amount);
      } else if (choice.equals("sell")) {
         int id = reader.getInt("Please enter ID: ");
         int amount = reader.getInt("Please enter the amount: ");
         stock.sellProduct(id, amount);
      } else if (choice.equals("remove")) {
         int id = reader.getInt("Please enter ID: ");
         stock.removeProduct(id);
      } else if (choice.equals("search")) {
         String name = reader.getString("Please enter name: ");
         stock.printName(name);
      } else if (choice.equals("lowstock")) {
         stock.lowPrint();
      } else if (choice.equals("restock")) {
         int amount = reader.getInt("How much do want to increase the quantity by: ");
         stock.reStock(amount);
      }

      return false;
   }

   /**
    * Print out a menu of operation choices
    */
   private void printMenuChoices() {
      System.out.println();
      System.out.println("    Add:        Add a new product");
      System.out.println("    Buy:        Buy a new product");
      System.out.println("    Sell:       Sell a product");
      System.out.println("    Remove:     Remove an old product");
      System.out.println("    ReStock:    Replenish the products that are low in stock");
      System.out.println("    Search:     Search a product");
      System.out.println("    Print:      Print all products");
      System.out.println("    LowStock:   Checks which product is in low stock");
      System.out.println("    Quit:       Quit the program");
      System.out.println();
   }

   /**
    * Print the title of the program and the authors name
    */
   private void printHeading() {
      System.out.println("********************************");
      System.out.println("  App21-04: Stock Application ");
      System.out.println("      by Youssef El-Guoshi");
      System.out.println("********************************");
   }
}