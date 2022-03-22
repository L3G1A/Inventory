package Inventory.Models;

import java.util.ArrayList;

public class Invoice {

    private int id;
    private Customer client;
    private SalesPerson salesPerson;
    private double invoiceTotalPrice;
    private double deliveryFee;
    private boolean delivery;
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getClient() {
        return client;
    }

    public void setClient(Customer client) {
        this.client = client;
    }

    public Inventory.Models.SalesPerson getSalesPerson() {
        return salesPerson;
    }

    public void setSalesPerson(Inventory.Models.SalesPerson salesPerson) {
        this.salesPerson = salesPerson;
    }

    public double getInvoiceTotalPrice() {
        return invoiceTotalPrice;
    }

    public void setInvoiceTotalPrice(double invoiceTotalPrice) {
        this.invoiceTotalPrice = invoiceTotalPrice;
    }

    public double getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(double deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public boolean isDelivery() {
        return delivery;
    }

    public void setDelivery(boolean delivery) {
        this.delivery = delivery;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    private ArrayList<Product> products;
    private String date;

    public Invoice(int id, Customer client, SalesPerson salesPerson, double invoiceTotalPrice, double deliveryFee, boolean delivery, String status, ArrayList<Product> products, String date){

        this.id = id;
        this.client = client;
        this.salesPerson = salesPerson;
        this.invoiceTotalPrice = invoiceTotalPrice;
        this.deliveryFee = deliveryFee;
        this.delivery = delivery;
        this.status = status;
        this.products = products;
        this.date = date;

    }
}
