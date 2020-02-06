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
public class Account {
    Money balance;
    
    
    
    public Account(Money balance){
        this.balance = balance;
    }
    
    public void withdraw(Money m){
        
    }
    
    
    public void deposite(Money m){
        
    }
    
    public Money getBalance(){
        return balance;
    }
    
}
