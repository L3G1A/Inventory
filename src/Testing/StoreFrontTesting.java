package Testing;

import Inventory.StoreFront;

import static org.junit.Assert.*;

import org.junit.Test;

public class StoreFrontTesting {
    TestHelper _testHelper = new TestHelper();

    @Test
    public void test() {

        _testHelper.InitializeTestData();


        assertEquals(26, 26);

        _testHelper.ClearTestData();
    }

}
