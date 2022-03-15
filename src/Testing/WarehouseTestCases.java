package Testing;

import Inventory.Models.Warehouse;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class WarehouseTestCases {
    TestHelper _testHelper = new TestHelper();


    //this is an example test case, each class will have it own test case java file and class
    @Test
    public void test() {
        _testHelper.ClearTestData();
        //here we just initliaze the test data into the database
        _testHelper.InitializeTestData();
        //Here you do any computation you need
        //Always make sure you have it with try and catch
        try{
            Warehouse warehouse = new Warehouse(1);

            warehouse.LoadProductData();

            assertEquals(3, warehouse.GetProducts().size());

        }
       catch (Exception e)
        {
            e.printStackTrace();
        }




        //Once you finish your test you need to verify that the result is equal to the expected results
        //to do that you make the assert


        //once the assert is done you can then clear the data from the database
        _testHelper.ClearTestData();
    }

}
