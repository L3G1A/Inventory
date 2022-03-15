package Inventory;

import java.util.ArrayList;

public class Customer extends Person{

    private String StreetAddress;
    private String Country;
    private String State;
    private int ZipCode;
    private double SalesTaxPercent;

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public int getZipCode() {
        return ZipCode;
    }

    public void setZipCode(int zipCode) {
        ZipCode = zipCode;
    }

    public double getSalesTaxPercent() {
        return SalesTaxPercent;
    }

    public void setSalesTaxPercent(double salesTaxPercent) {
        SalesTaxPercent = salesTaxPercent;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getStreetAddress() {
        return StreetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        StreetAddress = streetAddress;
    }

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
