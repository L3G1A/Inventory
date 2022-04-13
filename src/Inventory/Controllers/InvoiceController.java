package Inventory.Controllers;

import Inventory.Models.*;
import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class InvoiceController {

    private void saveInvoiceToDatastore(Invoice invoice) throws Exception {
        //Invoice: id, CustomerID, SalespersonID, InvoicePriceTotal, DeliveryFree, Delivery, Status, Items, Date

        File file = new File("invoicedatabase.csv");
        String currentDir = System.getProperty("user.dir") + "\\Databases\\";

        try {
            FileWriter output = new FileWriter(currentDir + file, true);
            CSVWriter writer = new CSVWriter(output);
            String items = "";
            int i = 0;
            for(Product product : invoice.getProducts()){
                items += String.valueOf(product.getId());
                if(i < invoice.getProducts().size()){
                    items += "-";
                }
                i++;
            }

            String[] invoice1 = {String.valueOf(invoice.getId()), String.valueOf(invoice.getCustomer().getId()), String.valueOf(invoice.getSalesPerson().getId()), String.valueOf(invoice.getInvoiceTotalPrice()), String.valueOf(invoice.getDeliveryFee()), String.valueOf(invoice.isDelivery()), invoice.getStatus(), items, invoice.getDate()};
            writer.writeNext(invoice1);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void createInvoice(Customer client, SalesPerson SalesPerson, double InvoiceTotalPrice, double DeliveryFee, boolean Delivery, String Status, ArrayList<Product> Items, String Date) throws Exception {
       int id = StoreFront.getInstance().accessDB().getInvoices().size();
        if(Items.size() == 0){
            throw new Exception("Invoice cannot have empty items");
        }
        if(SalesPerson == null){
            throw new Exception("Salesperson cannot be null");
        }
        if(client == null){
            throw new Exception("Client cannot be null");

        }
        Invoice invoice = new Invoice(id, client, SalesPerson, InvoiceTotalPrice, DeliveryFee, Delivery, Status, Items, Date);
        saveInvoiceToDatastore(invoice);
        ArrayList<Invoice> invoices = StoreFront.getInstance().accessDB().getInvoices();
        invoices.add(invoice);
        StoreFront.getInstance().accessDB().setInvoices(invoices);
    }

    public void editInvoice(){

    }
    public void closeInvoice(){

    }

    public void addOpenInvoice(){

    }

    public void addClosedInvoice(){

    }

    public ArrayList<Invoice> getOpenInvoices(){

        return null;
    }
    public void getClosedInvoices(){

    }
}
