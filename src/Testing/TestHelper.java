package Testing;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.opencsv.CSVWriter;

public class TestHelper {

    public void InitializeTestData(){
        //Creation Schemes
        //Product: id, Name, SellingPrice, CostPrice, QuantityOnHand, TotalSales, TotalCost, TotalProfitPercent, Category, IsBelowFive



        //Creating Test Product Info
        File file = new File("productdatabase.csv");
        String currentDir = System.getProperty("user.dir") + "\\Databases\\";
        try {
            FileWriter output = new FileWriter(currentDir + file);
            CSVWriter writer = new CSVWriter(output);
            String[] product1 = {"1", "Name1", "10.34", "4.55", "20", "22", "30.22", "43.3", "Category", "False"};
            writer.writeNext(product1);

            String[] product2 = {"2", "Name1", "10.34", "4.55", "20", "22", "30.22", "43.3", "Category", "False"};
            writer.writeNext(product2);

            String[] product3 = {"3", "Name1", "10.34", "4.55", "20", "22", "30.22", "43.3", "Category", "False"};
            writer.writeNext(product3);

            String[] product4 = {"4", "Name1", "10.34", "4.55", "20", "22", "30.22", "43.3", "Category", "False"};
            writer.writeNext(product4);

            String[] product5 = {"5", "Name1", "10.34", "4.55", "20", "22", "30.22", "43.3", "Category", "False"};
            writer.writeNext(product5);


            writer.close();

        }
      catch (IOException e) {
            e.printStackTrace();
        }




    }
    public void ClearTestData(){

    }
}
