/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab6;

import java.util.ArrayList;

/**
 *
 * @author aypatel
 */

public class Circuit {
    
    private static ArrayList <Resistor> resistors;
    private static Circuit instance = null;
    
    public static Circuit getInstance() {
        
        if (instance == null) {
            instance = new  Circuit();
        }
        return instance;
    }
     
    private Circuit() {
        resistors = new ArrayList<>();
    } 
    
    public void add(Resistor r) {
        resistors.add (r);
    }
    
    @Override
    public String toString() {
        String resistor = "";
        for (int i = 0; i < resistors.size(); i ++)
        {
            resistor += resistors.get(i).toString() + " \n";            
        }
        return resistor;
    }
    
}
