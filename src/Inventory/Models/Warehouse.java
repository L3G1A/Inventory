package Inventory.Models;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Warehouse {

    private ArrayList<Product> Products = new ArrayList<Product>();
    private int id;

    public Warehouse(int id){
        this.id = id;
        LoadProductData();
    }

    public ArrayList<Product> GetProducts(){
        return this.Products;
    }

    public ArrayList<Product> getProducts() {
        return Products;
    }

    public void setProducts(ArrayList<Product> products) {
        Products = products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void LoadProductData() {
        //Creation Scheme
        //Product: id, Name, SellingPrice, CostPrice, QuantityOnHand, TotalSales, TotalCost, TotalProfitPercent, Category, IsBelowFive, warehouse
    //public Product(int Id, String Name, double SellingPrice, int QuantityOnHand, double TotalSales, double TotalCost, double TotalProfitPercent, String Category, int Warehouse, boolean IsBelowFive){
        this.setProducts(new ArrayList<>());

        String file = System.getProperty("user.dir") + "\\Databases\\productdatabase.csv";

        try
        {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            List<String> lines = new ArrayList<>();
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] productData = line.replace("\"", "").split(",");

                if(Integer.valueOf(productData[10]) == this.id){
                    this.Products.add(new Product(Integer.valueOf(productData[0]), productData[1], Double.valueOf(productData[2]), Double.valueOf(productData[3]), Integer.valueOf(productData[4]), Double.valueOf(productData[5]), Double.valueOf(productData[6]), Double.valueOf(productData[7]), productData[8], Integer.valueOf(productData[10]), Boolean.valueOf(productData[9])));
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
