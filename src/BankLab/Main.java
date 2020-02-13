/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankLab;

/**
 *
 * @author Ramsey_Kerley
 */
public class Main {

    /**
     * I believe that this will take up to 8 hours
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Currency c = new Currency("dollar", "$");
        Money m = new Money(c, 100);
        Money m2 = new Money(c, 50);
        Account a = new Account(m);
        a.withdraw(m2);
        System.out.println(a.toString());
        a.deposite(m);
        System.out.println(a.toString());
        a.deposite(m);
        System.out.println(a.toString());
        a.withdraw(m2);
        System.out.println(a.toString());
        a.withdraw(m2);
        System.out.println(a.toString());
        a.deposite(m);
        System.out.println(a.toString());
        a.deposite(m);
        System.out.println(a.toString());
        a.deposite(m);
        System.out.println(a.toString());
        a.withdraw(m2);
        System.out.println(a.toString());
        a.withdraw(m2);
        System.out.println(a.toString());
    }

}
