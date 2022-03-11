package Testing;

import Inventory.StoreFront;
import Inventory.Warehouse;
import com.opencsv.exceptions.CsvValidationException;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class WarehouseTestCases {
    TestHelper _testHelper = new TestHelper();


    //this is an example test case, each class will have it own test case java file and class
    @Test
    public void test() {

        //here we just initliaze the test data into the database
        _testHelper.InitializeTestData();


        //Here you do any computation you need
        Warehouse warehouse = new Warehouse(1);

        warehouse.LoadProductData();

        warehouse.GetProducts();






        //Once you finish your test you need to verify that the result is equal to the expected results
        //to do that you make the assert


        //once the assert is done you can then clear the data from the database
        //_testHelper.ClearTestData();
    }

}
