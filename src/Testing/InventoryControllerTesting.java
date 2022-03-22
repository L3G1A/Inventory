package Testing;

import Inventory.Controllers.InventoryController;
import Inventory.Models.Product;
import Inventory.Models.StoreFront;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class InventoryControllerTesting {

    TestHelper _testHelper = new TestHelper();
    StoreFront storeFront;

    @Before
    public void initializeData(){
        _testHelper.ClearTestData();

        _testHelper.InitializeTestData();

        storeFront = StoreFront.getInstance();
    }

    @After
    public void clearData(){
        _testHelper.ClearTestData();
    }

    @Test
    public void GetAllProductsDecreasingProfitPercentTest() {

        storeFront.loadWarehouseData();
        ArrayList<Product> products = new InventoryController().getAllProductsDecreasingProfitPercent();

        assertEquals(  1421.3, products.get(0).getTotalProfitPercent(), 0.001);
        assertEquals( 1241.3, products.get(1).getTotalProfitPercent(), 0.001);
        assertEquals( 124.3, products.get(2).getTotalProfitPercent(), 0.001);
        assertEquals( 43.3, products.get(3).getTotalProfitPercent(), 0.001);
        assertEquals( 42.3, products.get(4).getTotalProfitPercent(), 0.001);

    }

    @Test
    public void GetAllLowProducts() {

        storeFront.loadWarehouseData();
        ArrayList<Product> products = new InventoryController().getLowProducts();

        assertEquals( 1, products.get(0).getQuantityOnHand());
        assertEquals( 2, products.get(1).getQuantityOnHand());
        assertEquals( 4, products.get(2).getQuantityOnHand());

    }

    @Test
    public void ProductSearchByID(){

        storeFront.loadWarehouseData();

        //Search Parameter
        int searchID = 1;

        //Test Search
        assertEquals(searchID, new InventoryController().searchByID(searchID).getId());
        searchID++;
        assertEquals(searchID, new InventoryController().searchByID(searchID).getId());
        searchID++;
        assertEquals(searchID, new InventoryController().searchByID(searchID).getId());

    }

    @Test
    public void ProductSearchByIDNoMatch(){

        storeFront.loadWarehouseData();

        //Search Parameter
        int searchID = 1024;

        //Test Search
        assertNull(new InventoryController().searchByID(searchID)); //No product returned

    }

    @Test
    public void ProductSearchByName(){

        storeFront.loadWarehouseData();

        //Search Parameter
        String searchName1 = "Name1";
        String searchName2 = "Name3";
        String searchName3 = "Name5";

        //Test Search
        assertEquals(searchName1, new InventoryController().searchByName(searchName1).getName());
        assertEquals(searchName2, new InventoryController().searchByName(searchName2).getName());
        assertEquals(searchName3, new InventoryController().searchByName(searchName3).getName());

    }

    @Test
    public void ProductSearchByNameNoMatch(){

        storeFront.loadWarehouseData();

        //Search Parameter
        String searchName = "NotARealProduct";

        //Test Search
        assertNull(new InventoryController().searchByName(searchName)); //No product returned

    }


}
