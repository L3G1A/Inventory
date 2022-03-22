package Inventory.Models;

public class Product {
    private int id;
    private String name;
    private double sellingPrice;
    private double costPrice;
    private int quantityOnHand;
    private double totalSales;
    private double totalCost;
    private double totalProfitPercent;
    private String category;

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Id=" + id +
                ", Name='" + name + '\'' +
                ", SellingPrice=" + sellingPrice +
                ", CostPrice=" + costPrice +
                ", QuantityOnHand=" + quantityOnHand +
                ", TotalSales=" + totalSales +
                ", TotalCost=" + totalCost +
                ", TotalProfitPercent=" + totalProfitPercent +
                ", Category='" + category + '\'' +
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
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    public int getQuantityOnHand() {
        return quantityOnHand;
    }

    public void setQuantityOnHand(int quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public double getTotalProfitPercent() {
        return totalProfitPercent;
    }

    public void setTotalProfitPercent(double totalProfitPercent) {
        this.totalProfitPercent = totalProfitPercent;
    }

    private int Warehouse;
    private boolean IsBelowFive;

    public Product(int id, String name, double sellingPrice, double costPrice, int quantityOnHand, double totalSales, double totalCost, double totalProfitPercent, String category, int warehouse, boolean isBelowFive){
        this.id = id;
        this.name = name;
        this.sellingPrice = sellingPrice;
        this.costPrice = costPrice;
        this.quantityOnHand = quantityOnHand;
        this.totalSales = totalSales;
        this.totalCost = totalCost;
        this.totalProfitPercent = totalProfitPercent;
        this.category = category;
        this.Warehouse = warehouse;
        this.IsBelowFive = isBelowFive;
    }

    public int getId(){
        return id;
    }


}
