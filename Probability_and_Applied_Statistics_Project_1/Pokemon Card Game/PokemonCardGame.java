// Let's write a monte carlo simulation. That means, using raw brute force, try to figure out
// something interesting.

// What if your deck had exactly 1 pokemon. How many times would you expect to have to
// "Mulligan" in order to have your only pokemon in your hand.

// What if your deck had 2? Etc.

// Write a simulation that shows the expected mulligans at 1 - 60 pokemons in your deck.

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class PokemonCardGame {

    ArrayList<Card> deck = new ArrayList<Card>();
    ArrayList<Card> hand = new ArrayList<Card>();
    int deckSize = 60;

    public PokemonCardGame() {
        deck.add(new Pokemon());

        for (int i = 1; i < deckSize; i++) {
            deck.add(new Energy());
        }
        Collections.shuffle(deck);
        
    }
    
    public PokemonCardGame(int pokemonCardCount, int energyCardCount) {
    	for (int i = 0; i < pokemonCardCount; i++) {
            deck.add(new Pokemon());
        }
        for (int i = 0; i < energyCardCount; i++) {
            deck.add(new Energy());
        }
        Collections.shuffle(deck);
    }

    public Card drawCard() {
        Random rng = new Random();
        int cardIndex = rng.nextInt(deck.size());
        Card drawnCard = deck.get(cardIndex);
        deck.remove(cardIndex);
        return drawnCard;
    }

    public void drawHand() {
        for (int i = 0; i < 7; i++) {
            hand.add(drawCard()); 
        }
    }

    public boolean evaluateOpeningHand() {
        for (int i = 0; i < hand.size(); i++) {
            Card currentCard = hand.get(i); // Fixed the index from 1 to i
            if (currentCard instanceof Pokemon) {
                return true;
            }
        }
        return false;
    }
    
    public boolean pokemonCardProbability() {
        drawHand();
        return evaluateOpeningHand();
        
    }

    public void run() {
        drawHand();
        System.out.println("There is a Pokemon: " + evaluateOpeningHand());
        
    }
    
}