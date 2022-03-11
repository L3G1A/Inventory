package Inventory;

import java.util.ArrayList;

public class Invoice {

    private int Id;
    private int CustomerId;
    private int SalesPersonId;
    private double InvoiceTotalPrice;
    private double DeliveryFee;
    private boolean Delivery;
    private String Status;
    private ArrayList<Integer> Items;
    private String Date;

    public Invoice(int Id, int CustomerId, int SalesPersonId, double InvoiceTotalPrice, double DeliveryFee, boolean Delivery, String Status, ArrayList<Integer> Items, String Date){

        this.Id = Id;
        this.CustomerId = CustomerId;
        this.SalesPersonId = SalesPersonId;
        this.InvoiceTotalPrice = InvoiceTotalPrice;
        this.DeliveryFee = DeliveryFee;
        this.Delivery = Delivery;
        this.Status = Status;
        this.Items = Items;
        this.Date = Date;

    }
}
