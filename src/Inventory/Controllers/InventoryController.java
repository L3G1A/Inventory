package Inventory.Controllers;

import Inventory.Models.Product;
import Inventory.Models.StoreFront;

import java.util.ArrayList;
import java.util.Collections;

public class InventoryController {

    public ArrayList<Product> GetAllProductsDecreasingProfitPercent(){
        ArrayList<Product> products = new ArrayList<>();
        products.addAll(StoreFront.getInstance().getWarehouse1().GetProducts());
        products.addAll(StoreFront.getInstance().getWarehouse2().GetProducts());
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

    public ArrayList<Product> GetLowProducts(){
        ArrayList<Product> products = new ArrayList<>();
        products.addAll(StoreFront.getInstance().getWarehouse1().GetProducts());
        products.addAll(StoreFront.getInstance().getWarehouse2().GetProducts());
        ArrayList<Product> lowProducts = new ArrayList<>();

        for(Product product : products){
            if(product.isBelowFive() == true){
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

}
