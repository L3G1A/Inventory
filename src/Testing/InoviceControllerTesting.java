package Testing;
import Inventory.Controllers.InvoiceController;
import Inventory.Models.StoreFront;

import static org.junit.Assert.*;

import org.junit.Test;
public class InoviceControllerTesting {

    TestHelper _testHelper = new TestHelper();
    @Test
    public void CreateNewInoivce() {

        //here we just initliaze the test data into the database and make sure they test databases are all clear
        _testHelper.ClearTestData();

        _testHelper.InitializeTestData();


        //Here you do any computation you need

        InvoiceController invoiceController = new InvoiceController();
        invoiceController.createNewInvoice();

        //Once you finish your test you need to verify that the result is equal to the expected results
        //to do that you make the assert


        //once the assert is done you can then clear the data from the database
        _testHelper.ClearTestData();
    }

}
