package com.company;

public class HourlyPaid extends Employee {
    private double rateOfPay;
    private double totalWeeklyHoursWorked;

    public HourlyPaid(String name, double rateOfPay, double totalWeeklyHoursWorked) {
        super(name);
        this.rateOfPay = rateOfPay;
        this.totalWeeklyHoursWorked = totalWeeklyHoursWorked;
    }

    public double getRateOfPay() {
        return rateOfPay;
    }

    public double getTotalWeeklyHoursWorked() {
        return totalWeeklyHoursWorked;
    }

    @Override
    public double computePay() {
        return rateOfPay*totalWeeklyHoursWorked;
    }

    @Override
    public String toString() {
        return "HourlyPaid{" +
                "name='" + super.getName() + '\'' +
                "rateOfPay=" + rateOfPay +
                ", totalWeeklyHoursWorked=" + totalWeeklyHoursWorked +
                '}';
    }
}
