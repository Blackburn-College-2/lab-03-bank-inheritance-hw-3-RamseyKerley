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
public class Loan extends Account {
    double interestRate = .10;
    public Loan(Money m){
        super(m);
    }
    
    
     public Money accrue(){
     super.balance.amount = super.balance.amount + (long)(super.balance.amount * interestRate);
     return super.balance ;
   }
    
     public void payOff(CheckingAccount c){
         c.withdraw(super.balance);
         if(c.balance.amount < super.balance.amount){
             System.out.println("you are in dept");
         }else{
             super.balance.amount = 0;
         }
     }
     
     
    
    @Override
    public String toString(){
        return "You have to pay this much: " + balance.toString();
        
    }
}
