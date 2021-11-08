
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 */
public class StockDemo
{
    // The stock manager.
    private StockList stock;

    /**
     * Create a StockManager and populate it with at least
     * 10 sample products.
     */
    public StockDemo(StockList stock)
    {
        this.stock = new StockList();
        
        // Add at least 10 products, they must be unique to you
        // Make sure the ids are sequential numbers
        
        stock.add(new Product(1, "Dead by Daylight"));
        stock.add(new Product(2, "Slay the Spire"));
        stock.add(new Product(3, "Dying Light"));
        stock.add(new Product(4, "Inscryption"));
        stock.add(new Product(5, "PAYDAY 2"));
        stock.add(new Product(6, "Risk of Rain 2"));
        stock.add(new Product(7, "Phasmophobia"));
        stock.add(new Product(8, "MORDHAU"));
        stock.add(new Product(9, "Unturned"));
        stock.add(new Product(10, "DOOM Eternal"));
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
        stock.print();     
    }
    
    private void buyProducts()
    {
        stock.buyProduct(101, 500);
    }

    private void sellProducts()
    {
        stock.sellProduct(101,300);
    }    
}