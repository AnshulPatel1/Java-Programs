/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab4;

/**
 *
 * @author aypatel
 */
public class Account {
    
    int anumber;
    String aname;
    double ibalance;
    
    public Account(String name,int number,double initialbalance) {
        
     aname=name;
     anumber=number;
     ibalance=initialbalance;
    
    }
   
    public String getName() {
        
        return aname;
    }
   
    public double getBalance() {
        
        return ibalance;
    }
   
    public int getNumber() {
        
        return anumber;
    }
   
    public boolean deposit(double amount) 
    {
        if(amount<=0) 
            
            return false;
        
        else {
            
            ibalance+=amount;
        }
            return true;
    }
   
    public boolean withdraw(double amount)
    {
        if(amount<=0 || amount>ibalance)
            return false;
        else
        {
            ibalance-=amount;
            return true;
        }
    }
   
        @Override
    public String toString() {//DO NOT MODIFY
        return "(" + getName() + ", " + getNumber() + ", " +
                String.format("$%.2f", getBalance()) + ")";
    }
   
   
   
   
}
       
