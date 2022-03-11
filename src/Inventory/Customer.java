package Inventory;

import java.util.ArrayList;

public class Customer extends Person{

    private String StreetAddress;
    private String Country;
    private String State;
    private int ZipCode;
    private double SalesTaxPercent;
    private String City;

    public Customer(int Id, String FirstName, String LastName, String StreetAddress, String Country, String State, int ZipCode, double SalesTaxPercent, String City) {
        super(Id, FirstName, LastName);
        this.StreetAddress = StreetAddress;
        this.Country = Country;
        this.State = State;
        this.ZipCode = ZipCode;
        this.SalesTaxPercent = SalesTaxPercent;
        this.City = City;
    }


}
