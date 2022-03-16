package Inventory.Controllers;

import Inventory.Models.Invoice;

public class InvoiceController {

    private void saveInvoiceToDatastore(Invoice invoice){

    }
    public void createNewInvoice(){
        Invoice invoice = new Invoice();
        saveInvoiceToDatastore(invoice);
    }
}
