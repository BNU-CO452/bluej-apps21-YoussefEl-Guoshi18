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
        addProduct();
      } else if (choice.equals("buy")) {
        buyProduct();
      } else if (choice.equals("sell")) {
        sellProduct();
      } else if (choice.equals("remove")) {
        removeProduct();
      } else if (choice.equals("search")) {
        searchProduct();
      } else if (choice.equals("lowstock")) {
        stock.lowPrint();
      } else if (choice.equals("restock")) {
        reStockProduct();
      }

      return false;
   }
   
   /**
    * Add a products to a list.
    */
   private void addProduct()
   {
       int id = reader.getInt("Please enter ID: ");
        String name = reader.getString("Please enter name: ");
        stock.addProduct(id, name);
   }
   
   /**
    * Asks the user for the quantity and the product with low quantity is increased.
    */
   private void reStockProduct()
   {
       int amount = reader.getInt("How much do want to increase the quantity by: ");
       stock.reStock(amount);
   }
   
   /**
    * Prints the list of the product containing the String name.
    */
   private void searchProduct()
   {
       String name = reader.getString("Please enter name: ");
       stock.printName(name);
   }
   
   /**
    * Removes the product by ID.
    */
   private void removeProduct()
   {
       int id = reader.getInt("Please enter ID: ");
       stock.removeProduct(id);
   }
   
   /**
    * Sell the product by that amount requested by the user.
    */
   private void sellProduct()
   {
       int id = reader.getInt("Please enter ID: ");
       int amount = reader.getInt("Please enter the amount: ");
       stock.sellProduct(id, amount);
   }
   
   /**
    * Buys the product by the amount the user requested.
    */
   private void buyProduct()
   {
       int id = reader.getInt("Please enter ID: ");
       int amount = reader.getInt("Please enter the amount: ");
       stock.buyProduct(id, amount);
       System.out.println("Product with ID, " + id + " has been successfully bought by " + amount);
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