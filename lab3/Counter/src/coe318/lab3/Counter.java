/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab3;

/**
 *
 * @author aypatel
 */
public class Counter {

     private int number; 
     private int mod; 
     private Counter left; 
    
     public Counter(int modulus, Counter left) {
        
         this.number = 0;
         this.mod = modulus; 
         this.left = left; 
         
    }


    /**
     * @return the modulus
     */
    public int getModulus() {
        
        return this.mod; 
    }

    /**
     * Returns the Counter to the left attached to this
     * Counter.  Returns null if there is no Counter
     * to the left.
     * @return the left
     */
    public Counter getLeft() {
        
        return this.left; 
    }

    /**
     * @return the digit
     */
    public int getDigit() {
        
        return this.number; 
    }

    /**
     * @param digit the digit to set
     */
    public void setDigit(int digit) {
        
        this.number = digit; 
    }

    /**
     * Increment this counter.  If it rolls over,
     * its left Counter is also incremented if it
     * exists.
     */
    public void increment() {
        
        this.number = this.number + 1;
        
        if (this.number == this.mod) { 
            
            this.number = 0;
            
            
        if (this.left != null) { 
            
            this.left.number = this.left.number + 1; 
            
        }
        }
    
    }

    /** Return the count of this Counter combined
     * with any Counter to its left.
     *
     * @return the count
     */
    public int getCount() {
       
        if ( this.left == null) { 
            
            return this.number; 
            
        } else { 
            
            return (this.number + (this.left.getCount() * this.mod)); 
            
        }
        
    }
    

    /** Returns a String representation of the Counter's
     * total count (including its left neighbour).
     * @return the String representation
     */
    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE
        return "" + getCount();
    }

}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  