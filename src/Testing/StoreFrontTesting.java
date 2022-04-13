package Testing;

import Inventory.Models.StoreFront;

import static org.junit.Assert.*;

import org.junit.*;

public class StoreFrontTesting {

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

    //this is an example test case, each class will have it own test case java file and class
    @Test
    public void test() {

        //Here you do any computation you need
        //StoreFront storeFront = StoreFront.getInstance();


        //Once you finish your test you need to verify that the result is equal to the expected results
        //to do that you make the assert

        assertNotNull( storeFront);

        //once the assert is done you can then clear the data from the database
    }


    @Test
    public void LoadInvoiceDataTest() {

        storeFront.accessDB().loadWarehouseData();
        storeFront.accessDB().loadCustomerData();

        storeFront.accessDB().loadInvoiceData();
        assertEquals(4, storeFront.accessDB().getInvoices().size());




        assertNotNull( storeFront);

    }

    @Test
    public void LoadClientDataTest() {

        storeFront.accessDB().loadCustomerData();
        assertEquals(2, storeFront.accessDB().getCustomers().size());



        assertNotNull( storeFront);

    }

    @Test
    public void LoadSalesPersonDataTest() {

        storeFront.accessDB().loadSalespersonData();
        assertEquals(2, storeFront.accessDB().getCustomers().size());

        assertNotNull( storeFront);

    }

    @Test
    public void LoadWarehouseTestData() {


        storeFront.accessDB().loadWarehouseData();
        assertEquals(3, storeFront.accessDB().getWarehouse1().getProducts().size());

        assertNotNull( storeFront);

    }


}
