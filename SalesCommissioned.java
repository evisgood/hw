package com.company;

public class SalesCommissioned extends Employee {
    private double salesCommissioned;
    private double totalSalesForMonth;

    public SalesCommissioned(String name) {
        super(name);
        this.salesCommissioned = 0;
        this.totalSalesForMonth = 0;
    }

    public SalesCommissioned(String name, double salesCommissioned, double totalSalesForMonth) {
        super(name);
        this.salesCommissioned = salesCommissioned;
        this.totalSalesForMonth = totalSalesForMonth;
    }

    public double getSalesCommissioned() {
        return salesCommissioned;
    }

    public double getTotalSalesForMonth() {
        return totalSalesForMonth;
    }

    @Override
    public double computePay() {
        return (salesCommissioned*totalSalesForMonth)/100;
    }

    @Override
    public String toString() {
        return "SalesCommissioned{" +
                "name='" + super.getName() + '\'' +
                "salesCommissioned=" + salesCommissioned +
                ", totalSalesForMonth=" + totalSalesForMonth +
                '}';
    }
}
