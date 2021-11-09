import java.util.Random;
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author Youssef El-Guoshi
 * @version 09/11/2021
 */
public class StockDemo
{
    // The stock manager.
    private StockList stock;
    private StockList lowStock;
    
    private Random random;

    /**
     * Create a StockManager and populate it with at least
     * 10 sample products.
     */
    public StockDemo(StockList stock)
    {
        this.stock = stock;
        this.random = new Random();
        // Add at least 10 products, they must be unique to you
        // Make sure the ids are sequential numbers
        stock.add(new Product(101, "Dying Light"));
        stock.add(new Product(102, "Slay the Spire"));
        stock.add(new Product(103, "Dead by Daylight"));
        stock.add(new Product(104, "Inscryption"));
        stock.add(new Product(105, "DOOM Eternal"));
        stock.add(new Product(106, "MORDHAU"));
        stock.add(new Product(107, "PAYDAY 2"));
        stock.add(new Product(108, "Risk of Rain 2"));
        stock.add(new Product(109, "Unturned"));
        stock.add(new Product(110, "Splitgate"));
        runDemo();
    }
    
    /**
     * Provide a demonstration of how the ProductList meets all
     * the user requirements by making a delivery of each product 
     * buying it in various amounts and then selling each
     * product by various amounts. Make sure all the requirements
     * have been demonstrated.
     */
    public void runDemo()
    {
        // Show details of all of the products before delivery.
        
        stock.print();
        buyProducts();
        stock.print();        

        sellProducts();
        //removeProducts();
        stock.print();
        checkStock();
    }
    
    private void buyProducts()
    {
        for(int i = 101; i <= 110; i++)
        {
        stock.buyProduct(i, random.nextInt(2000));
        }
    }
    
     private void sellProducts()
    {
        for(int i = 101; i <= 110; i++)
        {
        stock.sellProduct(i, random.nextInt(2000));
        }
    } 
    
    private void checkStock()
    {
        stock.lowPrint();    
    }
    
    public void searchName(String name)
    {
        stock.printName(name);
    }
    
    private void removeProducts()
    {
        stock.removeProduct(110);
    }
    

        
}