package Testing;

import Inventory.StoreFront;

import static org.junit.Assert.*;

import org.junit.Test;

public class StoreFrontTesting {
    TestHelper _testHelper = new TestHelper();


    //this is an example test case, each class will have it own test case java file and class
    @Test
    public void test() {

        //here we just initliaze the test data into the database
        _testHelper.InitializeTestData();


        //Here you do any computation you need
        StoreFront storeFront = StoreFront.getInstance();


        //Once you finish your test you need to verify that the result is equal to the expected results
        //to do that you make the assert

        assertNotNull( storeFront);

        //once the assert is done you can then clear the data from the database
        _testHelper.ClearTestData();
    }

}
