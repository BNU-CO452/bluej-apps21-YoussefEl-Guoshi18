import java.util.ArrayList;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author Youssef El-Guoshi
 * @version 10/11/2021
 */
public class StockList
{
    // A list of the products.
    private ArrayList<Product> stock;
    //private ArrayList<Product> lowStock;

    /**
     * Initialise the stock manager.
     */
    public StockList()
    {
        stock = new ArrayList<Product>();
        //lowStock = new ArrayList<Product>();
    }

    /**
     * Add a product to the list.
     * @param item The product item to be added.
     */
    public void add(Product item)
    {
        stock.add(item);
    }
    
    /**
     * A method to buy a single quantity of the product
     */
    public void buyProduct(int productID)
    {
        buyProduct(productID, 1);
    }
    
    
    /**
     * Buy a quantity of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void buyProduct(int productID, int amount)
    {
        Product product = findProduct(productID);
        if(product != null) 
        {
            if(product.getQuantity() < 1000)
            {
                product.increaseQuantity(amount);
                
                System.out.println(product.getName() + " is increased by " + amount + "!");
            }
            else
            {
                System.out.println("There is no product to buy!");
            }
        }
        else
        {
            System.out.println("Product not found.");
        }
    }
    
    /**
     * Find a product to match the product id,
     * if not found return null
     */
    public Product findProduct(int productID)
    {
        for(Product product : stock)
        {
            if(product.getID() == productID)
            {
                return product;
            }
        }
        return null;
    }
    
    public void sellProduct(int productID)
    {
        sellProduct(productID, 1);
    }
    
    /**
     * Sell one of the given product.
     * Show the before and after status of the product.
     * @param id The ID of the product being sold.
     */
    public void sellProduct(int productID, int amount)
    {
        Product product = findProduct(productID);
        
        if(product != null) 
        {
            if(product.getQuantity() > 0 && product.getQuantity() > amount)
            {
                product.decreaseQuantity(amount);
                
                System.out.println(product.getName() + " has "+ amount + " product sold!");
            }
            else if(product.getQuantity() == 0)
            {
                System.out.println("There is no product for "+ product.getName() + "to sell!");
            }
            else
            {
                System.out.println("Can't sell the amount of " + product.getName() + "!");
            }
        }
        else
        {
            System.out.println("Product not found.");
        }
    }    

    
    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public int numberInStock(int productID)
    {
        return 0;
    }
    
    public void removeProduct(int productID)
    {
        Product product = findProduct(productID);
        stock.remove(product);
        System.out.println(product.getName() + " has been removed from the list!");
    }
    
    /**
     * Print details of the given product. If found,
     * its name and stock quantity will be shown.
     * @param id The ID of the product to look for.
     */
    public void printProduct(int productID)
    {
        Product product = findProduct(productID);
        
        if(product != null) 
        {
            System.out.println(product.toString());
        }
    }
    
    /**
     * Print out each product in the stock
     * in the order they are in the stock list
     */
    public void print()
    {
        printHeading();
        
        for(Product product : stock)
        {
            System.out.println(product);
        }

        System.out.println();
    }
    
     public void lowPrint()
    {
        printStock();
        
        for(Product product : stock)
        {
            if(product.getQuantity() < 500)
            {
            System.out.println(product);
            }
        }

        System.out.println();
    }
    
      public void printName(String name)
    {
        printNameHeading();
        
        for(Product product : stock)
        {
            if(product.getName().contains(name))
            {
            System.out.println(product);
            }
        }

        System.out.println();
    }
    
    public void printHeading()
    {
        System.out.println();
        System.out.println(" El-Guoshi's Stock List");
        System.out.println(" ====================");
        System.out.println();
    }
    
    public void printStock()
    {
        System.out.println();
        System.out.println(" OH NO looks like these products are in low stocks!");
        System.out.println(" =========================================");
        System.out.println();
    }
    
        public void printNameHeading()
    {
        System.out.println();
        System.out.println(" Here is what we have found!" );
        System.out.println(" =================");
        System.out.println();
    }
}

