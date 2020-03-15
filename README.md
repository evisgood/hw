# hw
HomeWork Mainor OOP Programming


Lab Assignment 3 (Abstract classes revision)
3 ponits:

Employees in a company are divided into the classes Employee, HourlyPaid, SalesCommissioned,

and Executive for the purpose of calculating their weekly wages or monthly salaries.

The data to be maintained for each class may be summarized as follows:

Employee class                                Name of employee
HourlyPaid class                              Rate of pay
                                                                   Total weekly hours worked

SalesCommissioned class                Percentage commission on total sales
                                                                   Total sales for month

Executive class                                Incremental point on annual salary scale
 
The methods used in each class may be summarized as follows:

Employee class                                getName
                                                                   computePay

HourlyPaid class                              getRate
                                                                   getHours

                                                                   computePay

SalesCommissioned class                getPercentage
                                                                   getSales

                                                                   computePay

Executive class                                getIncrement
                                                                   computePay

Note: To compute the monthly gross wage of an executive, it is necessary to construct a one-dimensional array containing an increasing annual salary scale. Each subscript to the array equates to an incremental point on the salary scale.

Implement the classes and write a test program to verify that the classes function correctly.

Create an array list of the employees of this company, add different employees and test classes' methods in the loop.
