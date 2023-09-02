package warehouseEx;


import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WarehouseService {
    private List<Product> productList;
    private int productIdCounter = 0;

    public WarehouseService() {
        //LISTELE/COLECTIILE SE INITIALIZEAZA IN CONSTRUCTOR
        this.productList = new ArrayList<>();
    }

    public int generateProductId() {
        productIdCounter++;
        return productIdCounter;
    }

    public void printProductList() {
        for (Product p : productList) {
            System.out.println(p.toString());
        }
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void updateProduct(Product product) {
        List<Product> pList = new ArrayList<>(this.productList);
        this.productList = new ArrayList<>();
        for (Product p : pList) {
            if (p.getId() != product.getId()) {
                this.productList.add(p);
            }
        }
        this.productList.add(product);
    }

    public void deleteProduct(Product product) {
        List<Product> pList = new ArrayList<>(this.productList);
        this.productList = new ArrayList<>();
        for (Product p : pList) {
            if (p.getId() != product.getId()) {
                this.productList.add(p);
            }
        }
    }

    public void calculateSumOfProducts() {
        Map<String, Integer> productsMap = new HashMap<>();
        for (Product p : productList) {
            String key = p.getName();

            if (productsMap.containsKey(key)){
                Integer quantity = productsMap.get(key);
                quantity++;
                productsMap.put(key,quantity);
            }else{
                productsMap.put(key, 1);
            }

        }
        System.out.println("Summaries: ");
        for(Map.Entry<String, Integer> item: productsMap.entrySet()){
            System.out.println(item.getKey() + " : " + item.getValue());
        }

    }
}
