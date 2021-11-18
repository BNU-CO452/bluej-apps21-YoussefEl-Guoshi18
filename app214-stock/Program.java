
/**
 * This class will call the main method, that runs the application.
 *
 * @author Youssef El-Guoshi
 * @version 18/11/2021
 */
public class Program {
   private static StockApp app;

   public static void main(String[] args) {
      app = new StockApp();
      app.run();
   }
}
