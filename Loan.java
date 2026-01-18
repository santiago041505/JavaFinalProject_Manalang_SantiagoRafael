/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loan;

/**
 *
 * @author Huawei
 */
public class Loan {
    

    private double principal;
    private double rate;
    private int years;

    // Constructor
    public Loan(double principal, double rate, int years) {
        this.principal = principal;
        this.rate = rate;
        this.years = years;
    }

    // Simple Interest Method
    public double calculateSimpleInterest() {
        return principal * rate * years;
    }

    // Compound Interest Method
    public double calculateCompoundInterest() {
        return principal * Math.pow(1 + rate, years) - principal;
    }

    // Array + Loop: yearly balances
    public double[] getYearlyBalances() {
        double[] balances = new double[years];
        double amount = principal;

        for (int i = 0; i < years; i++) {
            amount += amount * rate;
            balances[i] = amount;
        }
        return balances;
    }
}

