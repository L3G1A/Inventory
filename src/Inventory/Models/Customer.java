package Inventory.Models;

public class Customer extends Person {

    private String streetAddress;
    private String country;
    private String state;
    private int zipCode;
    private double salesTaxPercent;
    private String city;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public double getSalesTaxPercent() {
        return salesTaxPercent;
    }

    public void setSalesTaxPercent(double salesTaxPercent) {
        this.salesTaxPercent = salesTaxPercent;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }


    public Customer(int id, String firstName, String lastName, String streetAddress, String country, String state, int zipCode, double salesTaxPercent, String city) {
        super(id, firstName, lastName);
        this.streetAddress = streetAddress;
        this.country = country;
        this.state = state;
        this.zipCode = zipCode;
        this.salesTaxPercent = salesTaxPercent;
        this.city = city;
    }


}
