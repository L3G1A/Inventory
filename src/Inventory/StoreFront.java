package Inventory;

import java.awt.*;
import java.security.spec.RSAKeyGenParameterSpec;
import java.util.ArrayList;

public class StoreFront {


    /*

        This is a singleton implementation of the storefront class

        To use the class you must access via the getInstance Method

        StoreFront storeFront = StoreFront.getInstance();
     */
    private static StoreFront _storefront;

    private ArrayList<Customer> Clients;

    private ArrayList<Warehouse> Warehouses;

    private ArrayList<Invoice> Invoices;

    private ArrayList<SalesPerson> SalesPeople;


    public static  StoreFront getInstance(){
        if(_storefront == null) {
            _storefront = new StoreFront();
        }
        return _storefront;
    }


    /*
            We need to add in functions that will load the data to the lists from the files
     */

    private void LoadCustomerData(){

    }

    private void LoadInvoiceData(){

    }
    private void LoadWarehouseData(){
        Warehouse warehouse1 = new Warehouse(1);
        Warehouse warehouse2 = new Warehouse(2);

    }

}
