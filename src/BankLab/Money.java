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
    
    public Money(Currency c, long amount ){
        this.amount  = amount;
        this.currency = c;
        
    }
    
    public String getAmountString(){
        
        return "Amount : " + amount;
    }
    
    public Money add(Money input){
        
        return input;
    }
    
    
     public Money subtract(Money input){
        
        return input;
    }
     
     
    @Override
     public String toString(){
         return amount + " " + currency;
     }
    
    
    
}
