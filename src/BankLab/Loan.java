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
    
    public Loan(Money m){
        super(m);
    }
    
    
    
    
    
    @Override
    public String toString(){
        return "You have this much money in your acount: " + balance.toString();
        
    }
}
