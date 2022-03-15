package Inventory.Models;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class StoreFront {


    /*

        This is a singleton implementation of the storefront class

        To use the class you must access via the getInstance Method

        StoreFront storeFront = StoreFront.getInstance();
     */
    private static StoreFront _storefront;

    private ArrayList<Customer> Clients = new ArrayList<Customer>();

    private ArrayList<Warehouse> Warehouses;


    private ArrayList<Invoice> Invoices = new ArrayList<Invoice>();

    private ArrayList<SalesPerson> SalesPeople = new ArrayList<SalesPerson>();

    private Warehouse warehouse1;

    private Warehouse warehouse2;


    public static  StoreFront getInstance(){
        if(_storefront == null) {
            _storefront = new StoreFront();
        }
        return _storefront;
    }


    /*
            We need to add in functions that will load the data to the lists from the files
     */
    public ArrayList<SalesPerson> GetSalesPeople(){
        return SalesPeople;
    }

    public void LoadSalespersonData(){
        //Creation Scheme
        //Salesperson: id, firstname, lastname, CommisionPercent, TotalCommissionEarned
        //(int Id, String FirstName, String LastName, double CommissionPercent, double TotalCommissionEarned) {

        String file = System.getProperty("user.dir") + "\\Databases\\salespersondatabase.csv";
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            List<String> lines = new ArrayList<>();
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] salespersonData = line.replace("\"", "").split(",");

                this.SalesPeople.add(new SalesPerson(Integer.valueOf(salespersonData[0]), salespersonData[1], salespersonData[2], Double.valueOf(salespersonData[3]), Double.valueOf(salespersonData[4])));

            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    public ArrayList<Customer> GetClients(){
        return Clients;
    }


    public void LoadClientData(){
        //Creation Scheme
        //Customer: id, firstname, lastname, StreetAddress, Country, State, ZipCode, SalesTaxPercent, City, {Orders}
        //(int Id, String FirstName, String LastName, String StreetAddress, String Country, String State, int ZipCode, double SalesTaxPercent, String City) {

        String file = System.getProperty("user.dir") + "\\Databases\\customerdatabase.csv";
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            List<String> lines = new ArrayList<>();
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] clientData = line.replace("\"", "").split(",");

                this.Clients.add(new Customer(Integer.valueOf(clientData[0]), clientData[1], clientData[2], clientData[3], clientData[4], clientData[5], Integer.valueOf(clientData[6]), Double.valueOf(clientData[7]), clientData[8]));

            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public ArrayList<Invoice> GetInvoces(){
        return Invoices;
    }

    public void LoadInvoiceData(){

        //Creation Scheme
        //Invoice: id, CustomerID, SalespersonID, InvoicePriceTotal, DeliveryFree, Delivery, Status, Items, Date
        //(int Id, int CustomerId, int SalesPersonId, double InvoiceTotalPrice, double DeliveryFee, boolean Delivery, String Status, ArrayList<Integer> Items, String Date){

        String file = System.getProperty("user.dir") + "\\Databases\\invoicedatabase.csv";
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            List<String> lines = new ArrayList<>();
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] invoiceData = line.replace("\"", "").split(",");
                String[] cusomterItems = invoiceData[7].split("-");
                ArrayList<Product> products = new ArrayList<>();
                products.addAll(warehouse1.GetProducts());
                products.addAll(warehouse2.GetProducts());
                ArrayList<Product> invoiceProducts = new ArrayList<>();

                for (String item : cusomterItems) {
                    for (Product product: products )
                    {
                        if(product.getId() == Integer.valueOf(item)){
                            invoiceProducts.add(product);
                        }
                    }
                }
                Customer client = null;
                for(Customer customer : Clients){
                    if(customer.GetId() == Integer.valueOf(invoiceData[1])){
                        client = customer;
                    }
                }
                SalesPerson salesPerson = null;
                for(SalesPerson salesperson : SalesPeople){
                    if(salesperson.GetId() == Integer.valueOf(invoiceData[2])){
                        salesPerson = salesperson;
                    }
                }
                this.Invoices.add(new Invoice(Integer.valueOf(invoiceData[0]), client, salesPerson, Double.valueOf(invoiceData[3]), Double.valueOf(invoiceData[4]), Boolean.valueOf(invoiceData[5]), invoiceData[6], invoiceProducts, invoiceData[7]));

            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }


    public void LoadWarehouseData(){
        if(warehouse1 == null && warehouse2 == null){
            warehouse1 = new Warehouse(1);
            warehouse2 = new Warehouse(2);
        }else{
            warehouse1.LoadProductData();
            warehouse2.LoadProductData();
        }


    }

}
