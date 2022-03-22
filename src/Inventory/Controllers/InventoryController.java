package Inventory.Controllers;

import Inventory.Models.Product;
import Inventory.Models.StoreFront;

import java.util.ArrayList;
import java.util.Collections;

public class InventoryController {

    public ArrayList<Product> getAllProductsDecreasingProfitPercent(){
        ArrayList<Product> products = new ArrayList<>();
        products.addAll(StoreFront.getInstance().getWarehouse1().getProducts());
        products.addAll(StoreFront.getInstance().getWarehouse2().getProducts());
        for (int i = 0; i < products.size()-1; i++)
        {
            for (int j = 0; j < products.size()-i-1; j++){
                if (products.get(j).getTotalProfitPercent() < products.get(j+1).getTotalProfitPercent()){
                    Collections.swap(products, j, j+1);
                }
            }
        }
        return products;
    }

    public ArrayList<Product> getLowProducts(){
        ArrayList<Product> products = new ArrayList<>();
        products.addAll(StoreFront.getInstance().getWarehouse1().getProducts());
        products.addAll(StoreFront.getInstance().getWarehouse2().getProducts());
        ArrayList<Product> lowProducts = new ArrayList<>();

        for(Product product : products){
            if(product.isBelowFive()){
                lowProducts.add(product);
            }
        }

        for (int i = 0; i < lowProducts.size()-1; i++)
        {
            for (int j = 0; j < lowProducts.size()-i-1; j++){
                if (lowProducts.get(j).getQuantityOnHand() > lowProducts.get(j+1).getQuantityOnHand()){
                    Collections.swap(lowProducts, j, j+1);
                }
            }
        }

        return lowProducts;
    }


    //Search Functions
    //Search by ID
    public Product searchByID(int id){
        ArrayList<Product> products = new ArrayList<>();
        products.addAll(StoreFront.getInstance().getWarehouse1().getProducts());
        products.addAll(StoreFront.getInstance().getWarehouse2().getProducts());
        for(Product p:products){ //Linear Search
            if(p.getId() == id){
                return p;
            }
        }
        //No Product ID found
        return null;
    }


    //Search by Name
    public Product searchByName(String name){
        ArrayList<Product> products = new ArrayList<>();
        products.addAll(StoreFront.getInstance().getWarehouse1().getProducts());
        products.addAll(StoreFront.getInstance().getWarehouse2().getProducts());
        for(Product p:products){ //Linear Search
            if(p.getName().equals(name)){
                return p;
            }
        }
        //No Product Name found
        return null;
    }

}
