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
public class Currency {
   public String name;
   public String symbol;
   
   public Currency(String name, String symbol){
       this.name = name;
       this.symbol = symbol;
       
       
   }
   
   @Override
   public boolean equals(Object object){
       
       return true;
   }
    
    
    @Override
    public String toString(){
        return "this is your currency" + name + " " + symbol;
        
    }
    
    
}
