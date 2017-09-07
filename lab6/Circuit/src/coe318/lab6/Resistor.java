/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab6;

/**
 *
 * @author aypatel
 */

public class Resistor {
    
    private double r;
    private static int id = 0;
    private int iD;
    private Node[] nodes;
    private Node previous;
    private Node next;
    
    public Resistor(double resistance, Node node1, Node node2) {
        
        if (resistance < 0) {
            throw new IllegalArgumentException ("Resistance cannot be negative!");
        }
        
        if (node1 == node2) {
            throw new IllegalArgumentException ("Both nodes are the same!");
        }
        
        iD = id + 1;
        nodes = new Node[2];
        r = resistance;
        previous = node1;
        next = node2;
        
    }
    
    public Node [] getNodes() {
        nodes [1] = previous;
        nodes [2] = next;
        return nodes;
    }
    
    @Override
    public String toString() {
        return "R" + Integer.toString(iD) + ": " + previous + " " + next + " " + r;
    }
    
}
