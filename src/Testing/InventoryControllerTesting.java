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

}
