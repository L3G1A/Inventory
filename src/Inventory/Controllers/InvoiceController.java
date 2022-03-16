package Inventory.Controllers;

import Inventory.Models.*;
import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class InvoiceController {

    private void saveInvoiceToDatastore(Invoice invoice){
        //Invoice: id, CustomerID, SalespersonID, InvoicePriceTotal, DeliveryFree, Delivery, Status, Items, Date

        File file = new File("invoicedatabase.csv");
        String currentDir = System.getProperty("user.dir") + "\\Databases\\";

        try {
            FileWriter output = new FileWriter(currentDir + file, true);
            CSVWriter writer = new CSVWriter(output);
            String items = "";
            int i = 0;
            for(Product product : invoice.getItems()){
                items += String.valueOf(product.getId());
                if(i < invoice.getItems().size()){
                    items += "-";
                }
                i++;
            }

            String[] invoice1 = {String.valueOf(invoice.getId()), String.valueOf(invoice.getClient().GetId()), String.valueOf(invoice.getSalesPerson().getId()), String.valueOf(invoice.getInvoiceTotalPrice()), String.valueOf(invoice.getDeliveryFee()), String.valueOf(invoice.isDelivery()), invoice.getStatus(), items, invoice.getDate()};
            writer.writeNext(invoice1);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void createInvioce(Customer client, SalesPerson SalesPerson, double InvoiceTotalPrice, double DeliveryFee, boolean Delivery, String Status, ArrayList<Product> Items, String Date){
       int id = StoreFront.getInstance().GetInvoces().size();

        Invoice invoice = new Invoice(id, client, SalesPerson, InvoiceTotalPrice, DeliveryFee, Delivery, Status, Items, Date);
        saveInvoiceToDatastore(invoice);
        ArrayList<Invoice> invoices = StoreFront.getInstance().getInvoices();
        invoices.add(invoice);
        StoreFront.getInstance().setInvoices(invoices);
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
