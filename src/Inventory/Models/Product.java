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
    private int warehouse;
    private boolean isBelowFive;


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


    public int getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(int warehouse) {
        this.warehouse = warehouse;
    }

    public boolean isBelowFive() {
        return isBelowFive;
    }

    public void setBelowFive(boolean belowFive) {
        isBelowFive = belowFive;
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
        this.warehouse = warehouse;
        this.isBelowFive = isBelowFive;
    }

    public int getId(){
        return id;
    }

    public double calculateProfitPercent(){return 0;}


}
