package Inventory;

import java.util.ArrayList;

public class Invoice {

    private int Id;
    private Customer client;
    private SalesPerson SalesPerson;
    private double InvoiceTotalPrice;
    private double DeliveryFee;
    private boolean Delivery;
    private String Status;
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
