package Inventory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

public class Warehouse {

    private ArrayList<Product> Products;
    private int id;

    public Warehouse(int id){
        this.id = id;
    }

    public ArrayList<Product> GetProducts(){
        return this.Products;
    }

    public void LoadProductData() {
        //Creation Scheme
        //Product: id, Name, SellingPrice, CostPrice, QuantityOnHand, TotalSales, TotalCost, TotalProfitPercent, Category, IsBelowFive, warehouse
    //public Product(int Id, String Name, double SellingPrice, int QuantityOnHand, double TotalSales, double TotalCost, double TotalProfitPercent, String Category, int Warehouse, boolean IsBelowFive){

        String file = System.getProperty("user.dir") + "\\Databases\\productdatabase.csv";
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            List<String> lines = new ArrayList<>();
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] productData = line.replace("\"", "").split(",");
                System.out.println((productData[0]));
                //if(Integer.valueOf(productData[10]) == this.id){
                    this.Products.add( new Product(Integer.valueOf(productData[0]), productData[1], Double.valueOf(productData[2]), Integer.valueOf(productData[2]), Double.valueOf(productData[4]), Double.valueOf(productData[5]), Double.valueOf(productData[6]), productData[7], Integer.valueOf(productData[8]), Boolean.valueOf(productData[9])));
                //}
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
