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
    private ArrayList<Customer> customers = new ArrayList<Customer>();
    private ArrayList<Invoice> invoices = new ArrayList<Invoice>();
    private ArrayList<SalesPerson> salesPeople = new ArrayList<SalesPerson>();
    private Warehouse warehouse1;
    private Warehouse warehouse2;
    private ArrayList<Warehouse> warehouses;

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public ArrayList<Warehouse> getWarehouses() {
        return warehouses;
    }

    public void setWarehouses(ArrayList<Warehouse> warehouses) {
        this.warehouses = warehouses;
    }

    public ArrayList<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(ArrayList<Invoice> invoices) {
        this.invoices = invoices;
    }

    public ArrayList<SalesPerson> getSalesPeople() {
        return salesPeople;
    }

    public void setSalesPeople(ArrayList<SalesPerson> salesPeople) {
        this.salesPeople = salesPeople;
    }

    public Warehouse getWarehouse1() {
        return warehouse1;
    }

    public void setWarehouse1(Warehouse warehouse1) {
        this.warehouse1 = warehouse1;
    }

    public Warehouse getWarehouse2() {
        return warehouse2;
    }

    public void setWarehouse2(Warehouse warehouse2) {
        this.warehouse2 = warehouse2;
    }






    public static  StoreFront getInstance(){
        if(_storefront == null) {
            _storefront = new StoreFront();
        }
        return _storefront;
    }


    /*
            We need to add in functions that will load the data to the lists from the files
     */

    public void loadSalespersonData(){
        //Creation Scheme
        //Salesperson: id, firstname, lastname, CommisionPercent, TotalCommissionEarned
        //(int Id, String FirstName, String LastName, double CommissionPercent, double TotalCommissionEarned) {
        this.setSalesPeople(new ArrayList<>());
        String file = System.getProperty("user.dir") + "\\Databases\\salespersondatabase.csv";
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            List<String> lines = new ArrayList<>();
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] salespersonData = line.replace("\"", "").split(",");

                this.salesPeople.add(new SalesPerson(Integer.valueOf(salespersonData[0]), salespersonData[1], salespersonData[2], Double.valueOf(salespersonData[3]), Double.valueOf(salespersonData[4])));

            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }



    public void loadCustomerData(){
        //Creation Scheme
        //Customer: id, firstname, lastname, StreetAddress, Country, State, ZipCode, SalesTaxPercent, City, {Orders}
        //(int Id, String FirstName, String LastName, String StreetAddress, String Country, String State, int ZipCode, double SalesTaxPercent, String City) {
        this.setCustomers(new ArrayList<>());

        String file = System.getProperty("user.dir") + "\\Databases\\customerdatabase.csv";
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            List<String> lines = new ArrayList<>();
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] clientData = line.replace("\"", "").split(",");

                this.customers.add(new Customer(Integer.valueOf(clientData[0]), clientData[1], clientData[2], clientData[3], clientData[4], clientData[5], Integer.valueOf(clientData[6]), Double.valueOf(clientData[7]), clientData[8]));

            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public ArrayList<Invoice> getInvoces(){
        return invoices;
    }

    public void loadInvoiceData(){
        this.setInvoices(new ArrayList<>());

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
                products.addAll(warehouse1.getProducts());
                products.addAll(warehouse2.getProducts());
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
                for(Customer customer : customers){
                    if(customer.getId() == Integer.valueOf(invoiceData[1])){
                        client = customer;
                    }
                }
                SalesPerson salesPerson = null;
                for(SalesPerson salesperson : salesPeople){
                    if(salesperson.getId() == Integer.valueOf(invoiceData[2])){
                        salesPerson = salesperson;
                    }
                }
                this.invoices.add(new Invoice(Integer.valueOf(invoiceData[0]), client, salesPerson, Double.valueOf(invoiceData[3]), Double.valueOf(invoiceData[4]), Boolean.valueOf(invoiceData[5]), invoiceData[6], invoiceProducts, invoiceData[7]));

            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }




    public void loadWarehouseData(){
        if(warehouse1 == null && warehouse2 == null){
            warehouse1 = new Warehouse(1);
            warehouse2 = new Warehouse(2);
        }else{
            warehouse1.loadProductData();
            warehouse2.loadProductData();
        }


    }

}
