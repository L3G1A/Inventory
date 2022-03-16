package Testing;
import Inventory.Controllers.InvoiceController;
import Inventory.Models.Customer;
import Inventory.Models.Product;
import Inventory.Models.SalesPerson;
import Inventory.Models.StoreFront;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

public class InoviceControllerTesting {

    TestHelper _testHelper = new TestHelper();
    @Test
    public void CreateNewInoivce() {

        //here we just initliaze the test data into the database and make sure they test databases are all clear
        _testHelper.ClearTestData();

        _testHelper.InitializeTestData();

        //Here you do any computation you need
        StoreFront.getInstance().LoadWarehouseData();
        StoreFront.getInstance().LoadClientData();
        StoreFront.getInstance().LoadInvoiceData();
        StoreFront.getInstance().LoadSalespersonData();

        System.out.println(StoreFront.getInstance().getWarehouse1());

        InvoiceController invoiceController = new InvoiceController();
        ArrayList<Product> products = new ArrayList<>();
        products.add(StoreFront.getInstance().getWarehouse1().GetProducts().get(0));
        products.add(StoreFront.getInstance().getWarehouse1().GetProducts().get(1));

        Customer client = StoreFront.getInstance().GetClients().get(0);
        SalesPerson salesPerson = StoreFront.getInstance().GetSalesPeople().get(0);
        double InvoiceTotalPrice = 234.32;
        double DeliveryFee = 30.44;
        boolean Delivery = true;
        String status = "Shipped";
        String date = "2-30-2022";

        // reateInvioce(Customer client, SalesPerson SalesPerson, double InvoiceTotalPrice, double DeliveryFee, boolean Delivery, String Status, ArrayList<Product> Items, String Date){
        invoiceController.createInvioce(client, salesPerson, InvoiceTotalPrice, DeliveryFee, Delivery, status, products, date);




        assertEquals(5,  StoreFront.getInstance().GetInvoces().size());
        //Once you finish your test you need to verify that the result is equal to the expected results
        //to do that you make the assert


        //once the assert is done you can then clear the data from the database
        //_testHelper.ClearTestData();
    }

}
