/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab6;

/**
 *
 * @author aypatel
 */

public class Node {
    
    private int id;
    private static int nodeNum = -1;
    
    public Node() {
        id = ++ nodeNum;
    }
    
    @Override
    public String toString() {
        return Integer.toString(id);
    }    
}

