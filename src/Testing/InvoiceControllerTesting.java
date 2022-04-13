package Testing;
import Inventory.Controllers.InvoiceController;
import Inventory.Models.Customer;
import Inventory.Models.Product;
import Inventory.Models.SalesPerson;
import Inventory.Models.StoreFront;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class InvoiceControllerTesting {

    TestHelper _testHelper = new TestHelper();
    StoreFront storeFront;

    @Before
    public void initializeData(){
        _testHelper.ClearTestData();

        _testHelper.InitializeTestData();

        storeFront = StoreFront.getInstance();

        storeFront.accessDB().loadWarehouseData();
        storeFront.accessDB().loadCustomerData();
        storeFront.accessDB().loadInvoiceData();
        System.out.println(storeFront.accessDB().getInvoices().size());
        storeFront.accessDB().loadSalespersonData();
    }

    @After
    public void clearData(){
        _testHelper.ClearTestData();
    }

    @Test
    public void CreateNewInvoiceDeliveryTrue() throws Exception {

        InvoiceController invoiceController = new InvoiceController();
        ArrayList<Product> products = new ArrayList<>();
        products.add(storeFront.accessDB().getWarehouse1().getProducts().get(0));
        products.add(storeFront.accessDB().getWarehouse1().getProducts().get(1));

        Customer client = storeFront.accessDB().getCustomers().get(0);
        SalesPerson salesPerson = storeFront.accessDB().getSalesPeople().get(0);
        double InvoiceTotalPrice = 234.32;
        double DeliveryFee = 30.44;
        boolean Delivery = true;
        String status = "Shipped";
        String date = "2-30-2022";

        // reateInvioce(Customer client, SalesPerson SalesPerson, double InvoiceTotalPrice, double DeliveryFee, boolean Delivery, String Status, ArrayList<Product> Items, String Date){
        invoiceController.createInvoice(client, salesPerson, InvoiceTotalPrice, DeliveryFee, Delivery, status, products, date);

        assertEquals(5,  storeFront.accessDB().getInvoices().size());
        //Once you finish your test you need to verify that the result is equal to the expected results
        //to do that you make the assert


        //once the assert is done you can then clear the data from the database
        //_testHelper.ClearTestData();
    }

    @Test
    public void CreateNewInvoiceDeliveryFalse() throws Exception {

        InvoiceController invoiceController = new InvoiceController();
        ArrayList<Product> products = new ArrayList<>();
        products.add(storeFront.accessDB().getWarehouse1().getProducts().get(0));
        products.add(storeFront.accessDB().getWarehouse1().getProducts().get(1));

        Customer client = storeFront.accessDB().getCustomers().get(0);
        SalesPerson salesPerson = storeFront.accessDB().getSalesPeople().get(0);
        double InvoiceTotalPrice = 234.32;
        double DeliveryFee = 0;
        boolean Delivery = false;
        String status = "Shipped";
        String date = "2-30-2022";


        // reateInvioce(Customer client, SalesPerson SalesPerson, double InvoiceTotalPrice, double DeliveryFee, boolean Delivery, String Status, ArrayList<Product> Items, String Date){
        invoiceController.createInvoice(client, salesPerson, InvoiceTotalPrice, DeliveryFee, Delivery, status, products, date);

        assertEquals(5,  storeFront.accessDB().getInvoices().size());
        //Once you finish your test you need to verify that the result is equal to the expected results
        //to do that you make the assert


        //once the assert is done you can then clear the data from the database
        //_testHelper.ClearTestData();
    }

    @Test
    public void CreateNewInvoiceSingleItem() throws Exception {

        InvoiceController invoiceController = new InvoiceController();
        ArrayList<Product> products = new ArrayList<>();
        products.add(storeFront.accessDB().getWarehouse1().getProducts().get(0));

        Customer client = storeFront.accessDB().getCustomers().get(0);
        SalesPerson salesPerson = storeFront.accessDB().getSalesPeople().get(0);
        double InvoiceTotalPrice = 234.32;
        double DeliveryFee = 0;
        boolean Delivery = false;
        String status = "Shipped";
        String date = "2-30-2022";

        // reateInvioce(Customer client, SalesPerson SalesPerson, double InvoiceTotalPrice, double DeliveryFee, boolean Delivery, String Status, ArrayList<Product> Items, String Date){
        invoiceController.createInvoice(client, salesPerson, InvoiceTotalPrice, DeliveryFee, Delivery, status, products, date);

        assertEquals(5,  storeFront.accessDB().getInvoices().size());
        //Once you finish your test you need to verify that the result is equal to the expected results
        //to do that you make the assert


        //once the assert is done you can then clear the data from the database
        //_testHelper.ClearTestData();
    }
    @Test
    public void CreateNewInvoiceItemsEmpty() throws Exception {

        InvoiceController invoiceController = new InvoiceController();
        ArrayList<Product> products = new ArrayList<>();

        Customer client = storeFront.accessDB().getCustomers().get(0);
        SalesPerson salesPerson = storeFront.accessDB().getSalesPeople().get(0);
        double InvoiceTotalPrice = 234.32;
        double DeliveryFee = 0;
        boolean Delivery = false;
        String status = "Shipped";
        String date = "2-30-2022";

        // reateInvioce(Customer client, SalesPerson SalesPerson, double InvoiceTotalPrice, double DeliveryFee, boolean Delivery, String Status, ArrayList<Product> Items, String Date){

        String expectedMessage = "Invoice cannot have empty items";
        String actualMessage =         assertThrows(java.lang.Exception.class, () -> {invoiceController.createInvoice(client, salesPerson, InvoiceTotalPrice, DeliveryFee, Delivery, status, products, date);}).getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

        //Once you finish your test you need to verify that the result is equal to the expected results
        //to do that you make the assert


        //once the assert is done you can then clear the data from the database
        //_testHelper.ClearTestData();
    }

    @Test
    public void CreateNewInvoiceNullClient() throws Exception {

        InvoiceController invoiceController = new InvoiceController();
        ArrayList<Product> products = new ArrayList<>();
        products.add(storeFront.accessDB().getWarehouse1().getProducts().get(0));

        Customer client = null;
        SalesPerson salesPerson = storeFront.accessDB().getSalesPeople().get(0);
        double InvoiceTotalPrice = 234.32;
        double DeliveryFee = 0;
        boolean Delivery = false;
        String status = "Shipped";
        String date = "2-30-2022";

        // reateInvioce(Customer client, SalesPerson SalesPerson, double InvoiceTotalPrice, double DeliveryFee, boolean Delivery, String Status, ArrayList<Product> Items, String Date){

        String expectedMessage = "Client cannot be null";
        String actualMessage =         assertThrows(java.lang.Exception.class, () -> {invoiceController.createInvoice(client, salesPerson, InvoiceTotalPrice, DeliveryFee, Delivery, status, products, date);}).getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

        //Once you finish your test you need to verify that the result is equal to the expected results
        //to do that you make the assert


        //once the assert is done you can then clear the data from the database
        //_testHelper.ClearTestData();
    }


    @Test
    public void CreateNewInvoiceNullSalesperon() throws Exception {

        InvoiceController invoiceController = new InvoiceController();
        ArrayList<Product> products = new ArrayList<>();
        products.add(storeFront.accessDB().getWarehouse1().getProducts().get(0));
        Customer client = storeFront.accessDB().getCustomers().get(0);
        SalesPerson salesPerson = null;
        double InvoiceTotalPrice = 234.32;
        double DeliveryFee = 0;
        boolean Delivery = false;
        String status = "Shipped";
        String date = "2-30-2022";

        // reateInvioce(Customer client, SalesPerson SalesPerson, double InvoiceTotalPrice, double DeliveryFee, boolean Delivery, String Status, ArrayList<Product> Items, String Date){

        String expectedMessage = "Salesperson cannot be null";
        String actualMessage = assertThrows(java.lang.Exception.class, () -> {invoiceController.createInvoice(client, salesPerson, InvoiceTotalPrice, DeliveryFee, Delivery, status, products, date);}).getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

        //Once you finish your test you need to verify that the result is equal to the expected results
        //to do that you make the assert


        //once the assert is done you can then clear the data from the database
        //_testHelper.ClearTestData();
    }
}
