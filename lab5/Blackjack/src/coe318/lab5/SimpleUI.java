/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab5;

/**
 *
 * @author aypatel
 */
import java.util.Scanner;

public class SimpleUI implements UserInterface {
    private BlackjackGame game;
    private Scanner user = new Scanner(System.in);

  @Override
    public void setGame(BlackjackGame game) {
        this.game = game;
    }

  @Override
    public void display() {
        //FIX THIS
        System.out.println("You hold: "+ game.getYourCards());
        System.out.println("House holds: "+ game.getHouseCards());
        
    }

  @Override
    public boolean hitMe() {
       
        String hit= user.nextLine();
        System.out.println("Another card ? You said : " + hit);
        
        if(hit.equals("yes")) { 
            
            return true;
            
        } else if(hit.equals("no")) { 
            
                return false;
                
            }  else {
            
                System.out.println("You must enter either \"yes\" or \"no\"");
                hit = user.nextLine();
                return false;
                
            }
    
        }


  @Override
    public void gameOver() {
        //FIX THIS
        System.out.println("You Have Scored: "+ game.score(game.getYourCards()));
        System.out.println("House Has Scored: "+ game.score(game.getHouseCards()));
        
        if((game.score(game.getYourCards()) > 21))
            System.out.println("The House has won.");
        else
            if((game.score(game.getYourCards()) <= 21) && (game.score(game.getYourCards()) > game.score(game.getHouseCards())) && (game.score(game.getHouseCards()) <= 21))
    
                System.out.println("You have won.");
            else
                if((game.score(game.getYourCards()) <= 21) && game.score(game.getHouseCards()) > 21)
        System.out.println("You have won.");
        
        else
        
                    if((game.score(game.getYourCards()))==(game.score(game.getHouseCards())))
        
                        System.out.println("You have won.");
                    
                    else
        
                        System.out.println("You have won.");
       
        
    }

}