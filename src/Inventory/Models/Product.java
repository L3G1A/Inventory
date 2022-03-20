package Inventory.Models;

import org.hamcrest.core.Is;

public class Product {
    private int Id;
    private String Name;
    private double SellingPrice;
    private double CostPrice;
    private int QuantityOnHand;
    private double TotalSales;
    private double TotalCost;
    private double TotalProfitPercent;
    private String Category;

    public double getTotalSales() {
        return TotalSales;
    }

    public void setTotalSales(double totalSales) {
        TotalSales = totalSales;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", SellingPrice=" + SellingPrice +
                ", CostPrice=" + CostPrice +
                ", QuantityOnHand=" + QuantityOnHand +
                ", TotalSales=" + TotalSales +
                ", TotalCost=" + TotalCost +
                ", TotalProfitPercent=" + TotalProfitPercent +
                ", Category='" + Category + '\'' +
                ", Warehouse=" + Warehouse +
                ", IsBelowFive=" + IsBelowFive +
                '}';
    }

    public int getWarehouse() {
        return Warehouse;
    }

    public void setWarehouse(int warehouse) {
        Warehouse = warehouse;
    }

    public boolean isBelowFive() {
        return IsBelowFive;
    }

    public void setBelowFive(boolean belowFive) {
        IsBelowFive = belowFive;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getSellingPrice() {
        return SellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        SellingPrice = sellingPrice;
    }

    public double getCostPrice() {
        return CostPrice;
    }

    public void setCostPrice(double costPrice) {
        CostPrice = costPrice;
    }

    public int getQuantityOnHand() {
        return QuantityOnHand;
    }

    public void setQuantityOnHand(int quantityOnHand) {
        QuantityOnHand = quantityOnHand;
    }

    public double getTotalCost() {
        return TotalCost;
    }

    public void setTotalCost(double totalCost) {
        TotalCost = totalCost;
    }

    public double getTotalProfitPercent() {
        return TotalProfitPercent;
    }

    public void setTotalProfitPercent(double totalProfitPercent) {
        TotalProfitPercent = totalProfitPercent;
    }

    private int Warehouse;
    private boolean IsBelowFive;

    public Product(int Id, String Name, double SellingPrice, double CostPrice, int QuantityOnHand, double TotalSales, double TotalCost, double TotalProfitPercent, String Category, int Warehouse, boolean IsBelowFive){
        this.Id = Id;
        this.Name = Name;
        this.SellingPrice = SellingPrice;
        this.CostPrice = CostPrice;
        this.QuantityOnHand = QuantityOnHand;
        this.TotalSales = TotalSales;
        this.TotalCost = TotalCost;
        this.TotalProfitPercent = TotalProfitPercent;
        this.Category = Category;
        this.Warehouse = Warehouse;
        this.IsBelowFive = IsBelowFive;
    }

    public int getId(){
        return Id;
    }


}
