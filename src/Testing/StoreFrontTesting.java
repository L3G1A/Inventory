package Testing;

import Inventory.Models.Product;
import Inventory.Models.StoreFront;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;

public class StoreFrontTesting {
    TestHelper _testHelper = new TestHelper();


    //this is an example test case, each class will have it own test case java file and class
    @Test
    public void test() {

        //here we just initliaze the test data into the database and make sure they test databases are all clear
        _testHelper.ClearTestData();

        _testHelper.InitializeTestData();


        //Here you do any computation you need
        StoreFront storeFront = StoreFront.getInstance();


        //Once you finish your test you need to verify that the result is equal to the expected results
        //to do that you make the assert

        assertNotNull( storeFront);

        //once the assert is done you can then clear the data from the database
        _testHelper.ClearTestData();
    }


    @Test
    public void LoadInoivceDataTest() {
        _testHelper.ClearTestData();

        _testHelper.InitializeTestData();


        StoreFront storeFront = StoreFront.getInstance();
        storeFront.LoadWarehouseData();
        storeFront.LoadClientData();

        storeFront.LoadInvoiceData();
        assertEquals(4, storeFront.GetInvoces().size());




        assertNotNull( storeFront);

        _testHelper.ClearTestData();
    }

    @Test
    public void LoadClientDataTest() {
        _testHelper.ClearTestData();

        _testHelper.InitializeTestData();


        StoreFront storeFront = StoreFront.getInstance();
        storeFront.LoadClientData();
        assertEquals(2, storeFront.GetClients().size());



        assertNotNull( storeFront);

        _testHelper.ClearTestData();
    }

    @Test
    public void LoadSalesPersonDataTest() {
        _testHelper.ClearTestData();

        _testHelper.InitializeTestData();


        StoreFront storeFront = StoreFront.getInstance();
        storeFront.LoadSalespersonData();
        assertEquals(2, storeFront.GetClients().size());



        assertNotNull( storeFront);

        _testHelper.ClearTestData();
    }

    @Test
    public void LoadWarehouseTestData() {
        _testHelper.ClearTestData();

        _testHelper.InitializeTestData();


        StoreFront storeFront = StoreFront.getInstance();
        storeFront.LoadWarehouseData();
        assertEquals(3, storeFront.getWarehouse1().GetProducts().size());



        assertNotNull( storeFront);

        _testHelper.ClearTestData();
    }
    @Test
    public void GetAllProductsDecreasingProfitPercentTest() {
        _testHelper.ClearTestData();

        _testHelper.InitializeTestData();


        StoreFront storeFront = StoreFront.getInstance();
        storeFront.LoadWarehouseData();

        assertEquals( 1421.3, products.get(0).getTotalProfitPercent());
        assertEquals( 1241.3, products.get(1).getTotalProfitPercent());
        assertEquals( 124.3, products.get(2).getTotalProfitPercent());
        assertEquals( 43.3, products.get(3).getTotalProfitPercent());
        assertEquals( 42.3, products.get(4).getTotalProfitPercent());

        _testHelper.ClearTestData();
    }


    @Test
    public void GetAllLowProducts() {
        _testHelper.ClearTestData();

        _testHelper.InitializeTestData();


        StoreFront storeFront = StoreFront.getInstance();
        storeFront.LoadWarehouseData();
        ArrayList<Product> products = storeFront.GetLowProducts();

        assertEquals( 1, products.get(0).getQuantityOnHand());
        assertEquals( 2, products.get(1).getQuantityOnHand());
        assertEquals( 4, products.get(2).getQuantityOnHand());

        _testHelper.ClearTestData();
    }

}
