package warehouseEx;


/**
 * Warehouse
 * a. User should be able to: add, display all of the details, update, delete an item
 * b. Use composition and collections (The warehouse has products/items)
 * c. Add possibility to display summaries, like sum of all of the products, their prices.
 * d. *Add possibility to update number of items in a specific way, e.g.:
 * “pliers:30”
 * “scissors:+4"
 */
public class Main {
    public static void main(String[] args) {
        WarehouseService warehouseService = new WarehouseService();

        Product caiet = new Product(warehouseService.generateProductId(), "Caiet", 11.1);
        Product caiet2 = new Product(warehouseService.generateProductId(), "Caiet", 50.1);
        Product pix = new Product(warehouseService.generateProductId(), "Pix", 3.1);

        warehouseService.addProduct(caiet);
        warehouseService.addProduct(pix);
        warehouseService.addProduct(caiet2);


        warehouseService.printProductList();

        System.out.println("---------------------");

        caiet.setPrice(20.5);
        warehouseService.updateProduct(caiet);
        warehouseService.printProductList();

        System.out.println("----------------------");

       /* warehouseService.deleteProduct(caiet);*/
        warehouseService.printProductList();

        System.out.println("-------------");

        warehouseService.calculateSumOfProducts();

    }
}
