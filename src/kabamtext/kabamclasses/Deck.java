/*
 * All rights reserved to Yonatan Kaminsky and Gilad Kinory
 */

package kabamtext.kabamclasses;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Yonatan
 * Created on May 28, 2015
 */
public class Deck extends ArrayList<Card>{

    public Deck(boolean Showing, int initialCapacity) {
        super(initialCapacity);
        this.Showing = Showing;
        this.RefreshDeckShowingStatus();
    }
    
    private boolean Showing;

    /**
     * Get the value of Showing
     *
     * @return the value of Showing
     */
    public boolean isShowing() {
        return Showing;
    }

    /**
     * Set the value of Showing
     *
     * @param Showing new value of Showing
     */
    public void setShowing(boolean Showing) {
        this.Showing = Showing;
        this.RefreshDeckShowingStatus();
    }

    
    public void Shuffle() {
        ArrayList<Card> TempCardArrayList = new ArrayList<>(this);
        this.clear();
        Random RandomGenerator = new Random();
        for (int i = 0; i < TempCardArrayList.size(); i++) {
            int RandomIndex = 0;
            do {
                RandomIndex = RandomGenerator.nextInt(TempCardArrayList.size());
            } while (this.contains(TempCardArrayList.get(RandomIndex)));
            this.add(TempCardArrayList.get(RandomIndex));
        }
    }
    
    /**
     *
     * @return First card in the deck
     */
    public Card getCard() {
        Card CardChosen = this.get(0);
        this.remove(0);
        return CardChosen;
    }
    
    private void RefreshDeckShowingStatus() {
        for (Card card: this) {
            card.setShowing(this.isShowing());
        }
    }
    
}
