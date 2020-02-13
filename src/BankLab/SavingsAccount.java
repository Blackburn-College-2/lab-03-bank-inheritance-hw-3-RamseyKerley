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
public class SavingsAccount extends Account {
    private double interestRate = .01;
   public SavingsAccount(Money m){
        super(m);
    }
   
   
   public Money accrue(){
     super.balance.amount = super.balance.amount + (long)(super.balance.amount * interestRate);
     return super.balance ;
   }
   
    @Override
       public void withdraw(Money m){
        this.balance.amount = balance.amount - m.amount;
        this.balance = accrue();
        Currency c = new Currency("dollar","$"); 
        Money n = new Money(c,-m.amount);
        history.add(n);
        
    }
   
   
    @Override
    public String toString(){
        return "You have this much money in your acount: " + balance.toString();
        
    }
    
}
