package Inventory.Models;

public class SalesPerson extends Person {
    private double commissionPercent;
    private double totalCommissionEarned;

    public SalesPerson(int id, String firstName, String lastName, double commissionPercent, double totalCommissionEarned) {
        super(id, firstName, lastName);
        this.commissionPercent = commissionPercent;
        this.totalCommissionEarned = totalCommissionEarned;
    }

    public double getCommissionPercent() {
        return commissionPercent;
    }

    public void setCommissionPercent(double commissionPercent) {
        this.commissionPercent = commissionPercent;
    }

    public double getTotalCommissionEarned() {
        return totalCommissionEarned;
    }

    public void setTotalCommissionEarned(double totalCommissionEarned) {
        this.totalCommissionEarned = totalCommissionEarned;
    }
}
