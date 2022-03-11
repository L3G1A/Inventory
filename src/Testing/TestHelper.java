package Testing;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.opencsv.CSVWriter;

public class TestHelper {


    /*
        This is a class to assist in the testing of our classes
        The InitializeTestData function puts data into the csv database files for use in testing
        The ClearTestData clears the database files so that we can restart our testing each time

     */

    public void InitializeTestData(){
        //Creation Scheme
        //Product: id, Name, SellingPrice, CostPrice, QuantityOnHand, TotalSales, TotalCost, TotalProfitPercent, Category, IsBelowFive, warehouse


        //Creating Test Product Info
        File file = new File("productdatabase.csv");
        String currentDir = System.getProperty("user.dir") + "\\Databases\\";
        try {
            FileWriter output = new FileWriter(currentDir + file, true);
            CSVWriter writer = new CSVWriter(output);
            String[] product1 = {"1", "Name1", "10.34", "4.55", "20", "22", "30.22", "43.3", "Category", "False", "1"};
            writer.writeNext(product1);

            String[] product2 = {"2", "Name1", "10.34", "4.55", "543", "23", "1.22", "1241.3", "Category", "False", "2"};
            writer.writeNext(product2);

            String[] product3 = {"3", "Name1", "10.34", "4.55", "44", "2", "12.22", "124.3", "Category", "False", "1"};
            writer.writeNext(product3);

            String[] product4 = {"4", "Name1", "10.34", "4.55", "31", "34", "42.22", "42.3", "Category", "False", "1"};
            writer.writeNext(product4);

            String[] product5 = {"5", "Name1", "10.34", "4.55", "3", "5", "124.22", "1421.3", "Category", "True", "2"};
            writer.writeNext(product5);


            writer.close();

        }
      catch (IOException e) {
            e.printStackTrace();
        }

        //Creation Scheme
        //Salesperson: id, firstname, lastname, CommisionPercent, TotalCommissionEarned



        file = new File("salespersondatabase.csv");
        try {
            FileWriter output = new FileWriter(currentDir + file, true);
            CSVWriter writer = new CSVWriter(output);
            String[] saleperson1 = {"1", "John", "Doe", "15", "6000.34"};
            writer.writeNext(saleperson1);

            String[] saleperson2 = {"2", "Bill", "Johnson", "16", "3245.34"};
            writer.writeNext(saleperson2);
            writer.close();

        }
        catch (IOException e) {
            e.printStackTrace();
        }


        //Creation Scheme
        //Customer: id, firstname, lastname, StreetAddress, Country, State, ZipCode, SalesTaxPercent, City, {Orders}
        file = new File("customerdatabase.csv");
        try {
            FileWriter output = new FileWriter(currentDir + file, true);
            CSVWriter writer = new CSVWriter(output);
            String[] customer1 = {"1", "Bill", "Williams", "7563 Bellflower Blvd", "United States", "California", "90433", "12", "Long Beach", "1-2"};
            writer.writeNext(customer1);

            String[] customer2 = {"1", "Chris", "Harris", "1343 Beach Ave", "United States", "Arizona", "84924", "6", "Phoenix", "3-4"};
            writer.writeNext(customer2);
            writer.close();

        }
        catch (IOException e) {
            e.printStackTrace();
        }



        //Creation Scheme
        //Invoice: id, CustomerID, SalespersonID, InvoicePriceTotal, DeliveryFree, Delivery, Status, Items, Date
        file = new File("invoicedatabase.csv");
        try {
            FileWriter output = new FileWriter(currentDir + file, true);
            CSVWriter writer = new CSVWriter(output);
            String[] invoice1 = {"1", "1", "1", "103.55", "10.65", "True", "Shipped", "1-2-3", "2-10-2022"};
            writer.writeNext(invoice1);

            String[] invoice2 = {"1", "1", "2", "4323.55", "0", "False", "Complete", "1-3-3", "2-24-2022"};
            writer.writeNext(invoice2);

            String[] invoice3 = {"1", "2", "1", "643.55", "0", "False", "Processing", "1-3-3", "3-1-2022"};
            writer.writeNext(invoice3);

            String[] invoice4 = {"1", "2", "2", "5434.55", "32.33", "True", "Processing", "1-3-3", "3-3-2022"};
            writer.writeNext(invoice4);
            writer.close();

        }
        catch (IOException e) {
            e.printStackTrace();

        }

    }
    public void ClearTestData(){

        //clear product database
        File file = new File("productdatabase.csv");
        String currentDir = System.getProperty("user.dir") + "\\Databases\\";
        try {
            FileWriter output = new FileWriter(currentDir + file);
            CSVWriter writer = new CSVWriter(output);
            String[] product1 = {};
            writer.close();

        }
        catch (IOException e) {
            e.printStackTrace();
        }


        //clear salesperson database
        file = new File("salespersondatabase.csv");
        try {
            FileWriter output = new FileWriter(currentDir + file);
            CSVWriter writer = new CSVWriter(output);
            String[] product1 = {};
            writer.close();

        }
        catch (IOException e) {
            e.printStackTrace();
        }

        //clear customer database
        file = new File("customerdatabase.csv");
        try {
            FileWriter output = new FileWriter(currentDir + file);
            CSVWriter writer = new CSVWriter(output);
            String[] product1 = {};
            writer.close();

        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
