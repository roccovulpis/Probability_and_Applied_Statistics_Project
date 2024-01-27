// Let's write a monte carlo simulation. That means, using raw brute force, try to figure out
// something interesting.

// What if your deck had exactly 1 pokemon. How many times would you expect to have to
// "Mulligan" in order to have your only pokemon in your hand.

// What if your deck had 2? Etc.

// Write a simulation that shows the expected mulligans at 1 - 60 pokemons in your deck.

import java.util.ArrayList;
import java.util.Random;

public class PokemonCardGame {
    
	ArrayList<Card> deck = new ArrayList<Card>();
    ArrayList<Card> hand = new ArrayList<Card>();

    deck.add(new Pokemon());
    int deckSize = 60;

    for(int i = 1; i < deckSize; i++){
        deck.add(new Energy());
    }
			
}

public Card drawCard(){
    Random rng = new Random();
    int cardIndex = rng.nextInt(deck.size());
    Card drawnCard = deck.get(cardIndex);
    deck.remove(cardIndex);
    return drawnCard;
}

public void drawHand() {
    for(int i = 0; i < 7; i++) {
        hand.add(drawCard());
    }
}

public boolean evaulateOpeningHand() {
    boolean havePokemon = false;
    for(int i = 0; i < hand.size(); i++) {
        Card currentCard = hand.get(1);
        if(currentCard instanceof Pokemon) {
            return true;
        }

    }
    return false;
}
 public void run() {
    drawHand();
    System.err.println("Has Pokemon: " + evaulateOpeningHand());
 }