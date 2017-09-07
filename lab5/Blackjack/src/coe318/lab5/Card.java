/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab5;

/**
 *
 * @author aypatel
 */

public class Card implements Comparable {
  //Symbolic constants

  public static final int CLUB = 0;
  public static final int DIAMOND = 1;
  public static final int HEART = 2;
  public static final int SPADE = 3;

  /**
   * Construct a card of the given rank, suit and whether it is faceup or
   * facedown. The rank is an integer from 2 to 14. Numbered cards (2 to 10)
   * have a rank equal to their number. Jack, Queen, King and Ace have the ranks
   * 11, 12, 13, and 14 respectively. The suit is an integer from 0 to 3 for
   * Clubs, Diamonds, Hearts and Spades respectively.
   *
   * @param rank
   * @param suit
   * @param faceUp
 */
  public int rankOfCard;
  public int suitOfCard;
  public boolean CardFaceUp;
  
  
  public Card(int rank, int suit, boolean faceUp) {
    
    rankOfCard=rank;
    suitOfCard=suit;
    CardFaceUp=faceUp;
  }

  /**
   * @return the faceUp
   */
  public boolean isFaceUp() {
    return CardFaceUp; //FIX THIS
  }

  /**
   * @param faceUp the faceUp to set
   */
  public void setFaceUp(boolean faceUp) {
    //FIX THIS
    CardFaceUp=faceUp;
  }

  /**
   * @return the rank
   */
  public int getRank() {
    return rankOfCard; //FIX THIS
  }

  /**
   * @return the suit
   */
  public int getSuit() {
    return suitOfCard;//FIX THIS
  }

  @Override
  public boolean equals(Object ob) {
      
    if (!(ob instanceof Card)) {
      return false;
    }
    
    Card c = (Card) ob;
    
    if(c.getRank()==rankOfCard && c.getSuit() == suitOfCard) {
    return true; //FIX THIS
    } else {
        return false;
    }
  }

  @Override
  public int hashCode() {//DO NOT MODIFY
    int hash = 7;
    hash = 31 * hash + this.getRank();
    hash = 31 * hash + this.getSuit();
    return hash;
  }

  @Override
  public int compareTo(Object obj) {//DO NOT MODIFY
    return compareTo((Card) obj);
  }

  public int compareTo(Card c) {
    if(rankOfCard<c.rankOfCard) {
        return rankOfCard-c.rankOfCard;
    } if(rankOfCard==c.rankOfCard) {
        return rankOfCard-c.rankOfCard;
    } else {
        return rankOfCard-c.rankOfCard;
    } //FIX THIS
  }

  /**
   * Return the rank as a String. For example, the 3 of Hearts produces the
   * String "3". The King of Diamonds produces the String "King".
   *
   * @return the rank String
   */
  public String getRankString() {
    if(rankOfCard<11) {
        return String.valueOf(rankOfCard);
    } else {
        
        if(rankOfCard==11) {
            return "Jack";
        }
        
        if(rankOfCard==12) {
            return "Queen";
        }
        
        if(rankOfCard==13) {
            return "King";
        }
        else {
            return "Ace";}
    }
  }

  /**
   * Return the suit as a String: "Clubs", "Diamonds", "Hearts" or "Spades".
   *
   * @return the suit String
   */
  public String getSuitString() {
    if(suitOfCard==0) {
      return "Clubs";//FIX THIS
    } else { 
        if(suitOfCard==1) { 
            return "Diamonds";
        } else { 
            if(suitOfCard==2) { 
                return "Hearts";
            } else { 
                return "Spades";
            }
        } 
    }
}

  /**
   * Return "?" if the card is facedown; otherwise, the rank and suit of the
   * card.
   *
   * @return the String representation
   */
  @Override
  public String toString() {
        if(isFaceUp()==false) {
            return "?"; //FIX THIS
        }   
        return getRankString()+"of"+getSuitString();
  }

  public static void main(String[] args) {
    //Create 5 of clubs
    Card club5 = new Card(5, 0, true);
    System.out.println("club5: " + club5);
    Card spadeAce = new Card(14, SPADE, true);
    System.out.println("spadeAce: " + spadeAce);
    System.out.println("club5 compareTo spadeAce: "
            + club5.compareTo(spadeAce));
    System.out.println("club5 compareTo club5: "
            + club5.compareTo(club5));
    System.out.println("club5 equals spadeAce: "
            + club5.equals(spadeAce));
    System.out.println("club5 equals club5: "
            + club5.equals(club5));
  }
}

