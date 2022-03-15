package Inventory.Models;

import java.util.ArrayList;

public class Invoice {

    private int Id;
    private Customer client;
    private SalesPerson SalesPerson;
    private double InvoiceTotalPrice;
    private double DeliveryFee;
    private boolean Delivery;
    private String Status;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Customer getClient() {
        return client;
    }

    public void setClient(Customer client) {
        this.client = client;
    }

    public Inventory.Models.SalesPerson getSalesPerson() {
        return SalesPerson;
    }

    public void setSalesPerson(Inventory.Models.SalesPerson salesPerson) {
        SalesPerson = salesPerson;
    }

    public double getInvoiceTotalPrice() {
        return InvoiceTotalPrice;
    }

    public void setInvoiceTotalPrice(double invoiceTotalPrice) {
        InvoiceTotalPrice = invoiceTotalPrice;
    }

    public double getDeliveryFee() {
        return DeliveryFee;
    }

    public void setDeliveryFee(double deliveryFee) {
        DeliveryFee = deliveryFee;
    }

    public boolean isDelivery() {
        return Delivery;
    }

    public void setDelivery(boolean delivery) {
        Delivery = delivery;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public ArrayList<Product> getItems() {
        return Items;
    }

    public void setItems(ArrayList<Product> items) {
        Items = items;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    private ArrayList<Product> Items;
    private String Date;

    public Invoice(int Id, Customer client, SalesPerson SalesPerson, double InvoiceTotalPrice, double DeliveryFee, boolean Delivery, String Status, ArrayList<Product> Items, String Date){

        this.Id = Id;
        this.client = client;
        this.SalesPerson = SalesPerson;
        this.InvoiceTotalPrice = InvoiceTotalPrice;
        this.DeliveryFee = DeliveryFee;
        this.Delivery = Delivery;
        this.Status = Status;
        this.Items = Items;
        this.Date = Date;

    }
}
