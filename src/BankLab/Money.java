/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankLab;

/**
 *
 * @author ramsey.kerley
 */
public class Money {

    Currency currency;
    long amount;

    public Money(Currency c, long amount) {
        this.amount = amount;
        this.currency = c;

    }

    /**
     * gets the amount
     *
     * @return a string showing the amount
     */
    public String getAmountString() {

        return "Amount : " + amount;
    }

    public Money add(Money input) {
        input.amount = this.amount + input.amount;
        return input;
    }

    public Money subtract(Money input) {
        input.amount = this.amount - input.amount;
        return input;
    }

    public Money multiply(Money input) {
        input.amount = this.amount * input.amount;
        return input;
    }

    @Override
    public String toString() {
        return currency.symbol + "" + amount;
    }

    
    
}
