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
        Money m = new Money(c, 1000);
        Money m2 = new Money(c, 55);
        Money m3 = new Money(c, 90);
        Money m4 = new Money(c, 500);
        CheckingAccount a = new CheckingAccount(m);

        a.deposite(m);
        System.out.println(a.toString());
        System.out.println(a.getBalance());
        a.withdraw(m2);
        System.out.println(a.toString());
        System.out.println(a.getBalance());
        a.deposite(m2);
        System.out.println(a.toString());
        System.out.println(a.getBalance());
        a.deposite(m2);
        System.out.println(a.toString());
        System.out.println(a.getBalance());

        SavingsAccount s = new SavingsAccount(m);
        System.out.println("Savings");
        s.withdraw(m3);
        System.out.println(s.toString());
        s.withdraw(m3);
        System.out.println(s.toString());
        s.withdraw(m3);
        System.out.println(s.toString());
        s.deposite(m2);
        System.out.println(s.toString());
        s.deposite(m2);
        System.out.println(s.toString());
        s.deposite(m2);
        System.out.println(s.toString());
       

    }

}
