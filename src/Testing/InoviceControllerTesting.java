package Testing;
import Inventory.Controllers.InvoiceController;
import Inventory.Models.Customer;
import Inventory.Models.Product;
import Inventory.Models.SalesPerson;
import Inventory.Models.StoreFront;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;

public class InoviceControllerTesting {

    TestHelper _testHelper = new TestHelper();
    @Test
    public void CreateNewInoivceDeliveryTrue() throws Exception {

        //here we just initliaze the test data into the database and make sure they test databases are all clear
        _testHelper.ClearTestData();

        _testHelper.InitializeTestData();

        //Here you do any computation you need
        StoreFront.getInstance().loadWarehouseData();
        StoreFront.getInstance().loadCustomerData();
        StoreFront.getInstance().loadInvoiceData();
        StoreFront.getInstance().loadSalespersonData();


        InvoiceController invoiceController = new InvoiceController();
        ArrayList<Product> products = new ArrayList<>();
        products.add(StoreFront.getInstance().getWarehouse1().getProducts().get(0));
        products.add(StoreFront.getInstance().getWarehouse1().getProducts().get(1));

        Customer client = StoreFront.getInstance().getCustomers().get(0);
        SalesPerson salesPerson = StoreFront.getInstance().getSalesPeople().get(0);
        double InvoiceTotalPrice = 234.32;
        double DeliveryFee = 30.44;
        boolean Delivery = true;
        String status = "Shipped";
        String date = "2-30-2022";

        // reateInvioce(Customer client, SalesPerson SalesPerson, double InvoiceTotalPrice, double DeliveryFee, boolean Delivery, String Status, ArrayList<Product> Items, String Date){
        invoiceController.createInvioce(client, salesPerson, InvoiceTotalPrice, DeliveryFee, Delivery, status, products, date);




        assertEquals(5,  StoreFront.getInstance().getInvoces().size());
        //Once you finish your test you need to verify that the result is equal to the expected results
        //to do that you make the assert


        //once the assert is done you can then clear the data from the database
        //_testHelper.ClearTestData();
    }

    @Test
    public void CreateNewInoivceDeliveryFalse() throws Exception {

        //here we just initliaze the test data into the database and make sure they test databases are all clear
        _testHelper.ClearTestData();

        _testHelper.InitializeTestData();

        //Here you do any computation you need
        StoreFront.getInstance().loadWarehouseData();
        StoreFront.getInstance().loadCustomerData();
        StoreFront.getInstance().loadInvoiceData();
        StoreFront.getInstance().loadSalespersonData();


        InvoiceController invoiceController = new InvoiceController();
        ArrayList<Product> products = new ArrayList<>();
        products.add(StoreFront.getInstance().getWarehouse1().getProducts().get(0));
        products.add(StoreFront.getInstance().getWarehouse1().getProducts().get(1));

        Customer client = StoreFront.getInstance().getCustomers().get(0);
        SalesPerson salesPerson = StoreFront.getInstance().getSalesPeople().get(0);
        double InvoiceTotalPrice = 234.32;
        double DeliveryFee = 0;
        boolean Delivery = false;
        String status = "Shipped";
        String date = "2-30-2022";

        // reateInvioce(Customer client, SalesPerson SalesPerson, double InvoiceTotalPrice, double DeliveryFee, boolean Delivery, String Status, ArrayList<Product> Items, String Date){
        invoiceController.createInvioce(client, salesPerson, InvoiceTotalPrice, DeliveryFee, Delivery, status, products, date);




        assertEquals(5,  StoreFront.getInstance().getInvoces().size());
        //Once you finish your test you need to verify that the result is equal to the expected results
        //to do that you make the assert


        //once the assert is done you can then clear the data from the database
        //_testHelper.ClearTestData();
    }

    @Test
    public void CreateNewInoivceSingleItem() throws Exception {

        //here we just initliaze the test data into the database and make sure they test databases are all clear
        _testHelper.ClearTestData();

        _testHelper.InitializeTestData();

        //Here you do any computation you need
        StoreFront.getInstance().loadWarehouseData();
        StoreFront.getInstance().loadCustomerData();
        StoreFront.getInstance().loadInvoiceData();
        StoreFront.getInstance().loadSalespersonData();


        InvoiceController invoiceController = new InvoiceController();
        ArrayList<Product> products = new ArrayList<>();
        products.add(StoreFront.getInstance().getWarehouse1().getProducts().get(0));

        Customer client = StoreFront.getInstance().getCustomers().get(0);
        SalesPerson salesPerson = StoreFront.getInstance().getSalesPeople().get(0);
        double InvoiceTotalPrice = 234.32;
        double DeliveryFee = 0;
        boolean Delivery = false;
        String status = "Shipped";
        String date = "2-30-2022";

        // reateInvioce(Customer client, SalesPerson SalesPerson, double InvoiceTotalPrice, double DeliveryFee, boolean Delivery, String Status, ArrayList<Product> Items, String Date){
        invoiceController.createInvioce(client, salesPerson, InvoiceTotalPrice, DeliveryFee, Delivery, status, products, date);




        assertEquals(5,  StoreFront.getInstance().getInvoces().size());
        //Once you finish your test you need to verify that the result is equal to the expected results
        //to do that you make the assert


        //once the assert is done you can then clear the data from the database
        //_testHelper.ClearTestData();
    }
    @Test
    public void CreateNewInoivceItemsEmpty() throws Exception {

        //here we just initliaze the test data into the database and make sure they test databases are all clear
        _testHelper.ClearTestData();

        _testHelper.InitializeTestData();

        //Here you do any computation you need
        StoreFront.getInstance().loadWarehouseData();
        StoreFront.getInstance().loadCustomerData();
        StoreFront.getInstance().loadInvoiceData();
        StoreFront.getInstance().loadSalespersonData();


        InvoiceController invoiceController = new InvoiceController();
        ArrayList<Product> products = new ArrayList<>();

        Customer client = StoreFront.getInstance().getCustomers().get(0);
        SalesPerson salesPerson = StoreFront.getInstance().getSalesPeople().get(0);
        double InvoiceTotalPrice = 234.32;
        double DeliveryFee = 0;
        boolean Delivery = false;
        String status = "Shipped";
        String date = "2-30-2022";

        // reateInvioce(Customer client, SalesPerson SalesPerson, double InvoiceTotalPrice, double DeliveryFee, boolean Delivery, String Status, ArrayList<Product> Items, String Date){

        String expectedMessage = "Invoice cannot have empty items";
        String actualMessage =         assertThrows(java.lang.Exception.class, () -> {invoiceController.createInvioce(client, salesPerson, InvoiceTotalPrice, DeliveryFee, Delivery, status, products, date);}).getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

        //Once you finish your test you need to verify that the result is equal to the expected results
        //to do that you make the assert


        //once the assert is done you can then clear the data from the database
        //_testHelper.ClearTestData();
    }

    @Test
    public void CreateNewInoivceNullClient() throws Exception {

        //here we just initliaze the test data into the database and make sure they test databases are all clear
        _testHelper.ClearTestData();

        _testHelper.InitializeTestData();

        //Here you do any computation you need
        StoreFront.getInstance().loadWarehouseData();
        StoreFront.getInstance().loadCustomerData();
        StoreFront.getInstance().loadInvoiceData();
        StoreFront.getInstance().loadSalespersonData();


        InvoiceController invoiceController = new InvoiceController();
        ArrayList<Product> products = new ArrayList<>();
        products.add(StoreFront.getInstance().getWarehouse1().getProducts().get(0));

        Customer client = null;
        SalesPerson salesPerson = StoreFront.getInstance().getSalesPeople().get(0);
        double InvoiceTotalPrice = 234.32;
        double DeliveryFee = 0;
        boolean Delivery = false;
        String status = "Shipped";
        String date = "2-30-2022";

        // reateInvioce(Customer client, SalesPerson SalesPerson, double InvoiceTotalPrice, double DeliveryFee, boolean Delivery, String Status, ArrayList<Product> Items, String Date){

        String expectedMessage = "Client cannot be null";
        String actualMessage =         assertThrows(java.lang.Exception.class, () -> {invoiceController.createInvioce(client, salesPerson, InvoiceTotalPrice, DeliveryFee, Delivery, status, products, date);}).getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

        //Once you finish your test you need to verify that the result is equal to the expected results
        //to do that you make the assert


        //once the assert is done you can then clear the data from the database
        //_testHelper.ClearTestData();
    }


    @Test
    public void CreateNewInoivceNullSalesperon() throws Exception {

        //here we just initliaze the test data into the database and make sure they test databases are all clear
        _testHelper.ClearTestData();

        _testHelper.InitializeTestData();

        //Here you do any computation you need
        StoreFront.getInstance().loadWarehouseData();
        StoreFront.getInstance().loadCustomerData();
        StoreFront.getInstance().loadInvoiceData();
        StoreFront.getInstance().loadSalespersonData();


        InvoiceController invoiceController = new InvoiceController();
        ArrayList<Product> products = new ArrayList<>();
        products.add(StoreFront.getInstance().getWarehouse1().getProducts().get(0));
        Customer client = StoreFront.getInstance().getCustomers().get(0);
        SalesPerson salesPerson = null;
        double InvoiceTotalPrice = 234.32;
        double DeliveryFee = 0;
        boolean Delivery = false;
        String status = "Shipped";
        String date = "2-30-2022";

        // reateInvioce(Customer client, SalesPerson SalesPerson, double InvoiceTotalPrice, double DeliveryFee, boolean Delivery, String Status, ArrayList<Product> Items, String Date){

        String expectedMessage = "Salesperson cannot be null";
        String actualMessage =         assertThrows(java.lang.Exception.class, () -> {invoiceController.createInvioce(client, salesPerson, InvoiceTotalPrice, DeliveryFee, Delivery, status, products, date);}).getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

        //Once you finish your test you need to verify that the result is equal to the expected results
        //to do that you make the assert


        //once the assert is done you can then clear the data from the database
        //_testHelper.ClearTestData();
    }
}
