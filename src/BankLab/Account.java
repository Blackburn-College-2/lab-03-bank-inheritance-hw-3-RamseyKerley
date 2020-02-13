/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankLab;

import java.util.ArrayList;

/**
 *
 * @author ramsey.kerley
 */
public class Account {
    Money balance;
    ArrayList<Money> history = new ArrayList<Money>();
   
    
    public Account(Money startingAmount){
        this.balance = startingAmount;
    }
    
    public void withdraw(Money m){
        this.balance.amount = balance.amount - m.amount;
        Currency c = new Currency("dollar","$"); 
        Money n = new Money(c,-m.amount);
        history.add(n);
    }
    
    
    public void deposite(Money m){
         this.balance.amount = balance.amount + m.amount; 
         history.add(m);
    }
    
    public Money getBalance(){
        return balance;
    }
    
    public void printHistory(){
        for(int i = 0; i < history.size(); i++){
            System.out.println(history.get(i));
        }
    }
    
    @Override
    public String toString(){
        return "You have this much money in your acount: " + balance.toString();
        
    }
    
}
