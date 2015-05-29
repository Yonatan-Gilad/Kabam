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

    public Deck() {
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
    
}
