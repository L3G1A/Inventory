package Inventory;

public class SalesPerson extends Person{
    private double CommissionPercent;
    private double TotalCommissionEarned;

    public SalesPerson(int Id, String FirstName, String LastName, double CommissionPercent, double TotalCommissionEarned) {
        super(Id, FirstName, LastName);
        this.CommissionPercent = CommissionPercent;
        this.TotalCommissionEarned = TotalCommissionEarned;
    }
}
