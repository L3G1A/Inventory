package Testing;

import Inventory.Controllers.InventoryController;
import Inventory.Models.Product;
import Inventory.Models.StoreFront;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;

public class InventoryControllerTesting {
    TestHelper _testHelper = new TestHelper();


    @Test
    public void GetAllProductsDecreasingProfitPercentTest() {
        _testHelper.ClearTestData();

        _testHelper.InitializeTestData();


        StoreFront storeFront = StoreFront.getInstance();
        storeFront.LoadWarehouseData();
        ArrayList<Product> products = new InventoryController().GetAllProductsDecreasingProfitPercent();

        assertEquals(  1421.3, products.get(0).getTotalProfitPercent(), 0.001);
        assertEquals( 1241.3, products.get(1).getTotalProfitPercent(), 0.001);
        assertEquals( 124.3, products.get(2).getTotalProfitPercent(), 0.001);
        assertEquals( 43.3, products.get(3).getTotalProfitPercent(), 0.001);
        assertEquals( 42.3, products.get(4).getTotalProfitPercent(), 0.001);

        _testHelper.ClearTestData();
    }


    @Test
    public void GetAllLowProducts() {
        _testHelper.ClearTestData();

        _testHelper.InitializeTestData();


        StoreFront storeFront = StoreFront.getInstance();
        storeFront.LoadWarehouseData();
        ArrayList<Product> products = new InventoryController().GetLowProducts();

        assertEquals( 1, products.get(0).getQuantityOnHand());
        assertEquals( 2, products.get(1).getQuantityOnHand());
        assertEquals( 4, products.get(2).getQuantityOnHand());

        _testHelper.ClearTestData();
    }

    @Test
    public void ProductSearchByID(){
        _testHelper.ClearTestData();

        _testHelper.InitializeTestData();


        StoreFront storeFront = StoreFront.getInstance();
        storeFront.LoadWarehouseData();

        //Search Parameter
        int searchID = 1;

        //Test Search
        assertEquals(searchID, new InventoryController().searchByID(searchID).getId());
        searchID++;
        assertEquals(searchID, new InventoryController().searchByID(searchID).getId());
        searchID++;
        assertEquals(searchID, new InventoryController().searchByID(searchID).getId());

        _testHelper.ClearTestData();
    }

    @Test
    public void ProductSearchByIDNoMatch(){
        _testHelper.ClearTestData();

        _testHelper.InitializeTestData();


        StoreFront storeFront = StoreFront.getInstance();
        storeFront.LoadWarehouseData();

        //Search Parameter
        int searchID = 1024;

        //Test Search
        assertNull(new InventoryController().searchByID(searchID)); //No product returned

        _testHelper.ClearTestData();
    }

    @Test
    public void ProductSearchByName(){
        _testHelper.ClearTestData();

        _testHelper.InitializeTestData();


        StoreFront storeFront = StoreFront.getInstance();
        storeFront.LoadWarehouseData();

        //Search Parameter
        String searchName1 = "Name1";
        String searchName2 = "Name3";
        String searchName3 = "Name5";

        //Test Search
        assertEquals(searchName1, new InventoryController().searchByName(searchName1).getName());
        assertEquals(searchName2, new InventoryController().searchByName(searchName2).getName());
        assertEquals(searchName3, new InventoryController().searchByName(searchName3).getName());

        _testHelper.ClearTestData();
    }

    @Test
    public void ProductSearchByNameNoMatch(){
        _testHelper.ClearTestData();

        _testHelper.InitializeTestData();


        StoreFront storeFront = StoreFront.getInstance();
        storeFront.LoadWarehouseData();

        //Search Parameter
        String searchName = "NotARealProduct";

        //Test Search
        assertNull(new InventoryController().searchByName(searchName)); //No product returned

        _testHelper.ClearTestData();
    }


}
