public class TestPokemonCardGame {
    public static void main(String[] args) {
    	int testCount = 100000;
        for(int i = 1; i < 60; i++) {
        	int pokemonCardCount = 0;
        	for(int j = 1; j < testCount; j++) {
        	    PokemonCardGame test = new PokemonCardGame(i, 60 - i);
        	    if (test.pokemonCardProbability()) {
        	        pokemonCardCount++;
        	    }
        	}

        	System.out.println(String.format("Number of Pokemon cards: %d \nNumber of non-Pokemon Cards: %d "
        			+ "\nProbability of having a Pokemon in hand: %.3f%%\n",
                    i, (60 - i), (((double) pokemonCardCount / testCount) * 100)));
        	System.out.println("pokemonCardCount: " + pokemonCardCount);
        	System.out.println("testCount: " + testCount);

        }
    }
}