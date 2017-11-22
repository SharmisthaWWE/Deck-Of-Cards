
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Sharmistha Bardhan
 */

public class DeckOfCardsAssignment {
    private static ArrayList<CreateCard> allCards = new ArrayList<CreateCard>();                  //Storage for all 52 cards
    
    
    DeckOfCardsAssignment()
    {
        //All 52 cards are created using the helper class CreateCard.java
        for(CreateCard.suits oneSuite : CreateCard.suits.values()){
            for(CreateCard.faceValues oneFaceValue : CreateCard.faceValues.values()){
                CreateCard newCard = new CreateCard(oneSuite, oneFaceValue);        //Create a new card among 52 possible cards
                allCards.add(newCard);                                              //Storing the new card
            }
        }
    }
    
    //The shuffle method
    public static void shuffle(){
        Collections.shuffle(allCards);
    }
    
    //The dealOneCard() method
    public static CreateCard dealOneCard(){
       if(!allCards.isEmpty()) {
           CreateCard cardToReturn = allCards.get(0);
           allCards.remove(0);
           return cardToReturn;
       }
       else return null;
    } 
    

    public static void main(String args[]){
        DeckOfCardsAssignment obj = new DeckOfCardsAssignment();
        
        //The name of all the 52 cards present in the Deck will be printed
        System.out.println("All 52 Cards:");
        
        for(int i=0; i<52; i++)
        {
            System.out.print(allCards.get(i).cardSuite.name() + allCards.get(i).cardFaceValue.name() + " ");
        }
        
        //After shuffling all the cards in the Deck, the 52 card's name will be printed 
        System.out.println("\n\nAfter Shuffling:");
        
        shuffle();
        
        for(int i=0; i<52; i++)
        {
            System.out.print(allCards.get(i).cardSuite.name() + allCards.get(i).cardFaceValue.name() + " ");
        }
        
        //The following while loop will deal one card at a time from the deck until it becomes empty
        System.out.println("\n\nDeal One Card:");
        
        while(true)
        {
            CreateCard returnedCard;
            returnedCard = dealOneCard();
            
            if(returnedCard != null) System.out.print(returnedCard.cardSuite.name() + returnedCard.cardFaceValue.name() + " ");
            else{
                System.out.println("Deck is empty!");
                break;
            }
        }
    }
}
