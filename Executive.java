package com.company;

public class Executive extends Employee{
    private static double incrementalPoint[] = {100, 150, 200, 300, 450};
    private int increment;


    public Executive(String name, int increment) {
        super(name);
        this.increment = increment;
    }

    public int getIncrement() {
        return increment;
    }


    @Override
    public double computePay() {
        if (increment >= 0 && increment < incrementalPoint.length) {
            return incrementalPoint[increment];
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Executive{" +
                "name='" + super.getName() + '\'' +
                "increment=" + increment +
                '}';
    }
}
