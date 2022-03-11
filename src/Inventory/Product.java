package Inventory;

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


}
