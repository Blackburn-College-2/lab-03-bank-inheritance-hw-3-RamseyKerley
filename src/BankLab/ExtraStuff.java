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
public class ExtraStuff {
    public void printThis(){
            Currency c = new Currency("dollar", "$");
        Money m = new Money(c, 1000);
        Money m2 = new Money(c, 55);
        Money m3 = new Money(c, 90);
        Money m4 = new Money(c, 500);
        CheckingAccount a = new CheckingAccount(m);

        
    }
}
