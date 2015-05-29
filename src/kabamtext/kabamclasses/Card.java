/*
 * All rights reserved to Yonatan Kaminsky and Gilad Kinory
 */

package kabamtext.kabamclasses;

/**
 *
 * @author Yonatan
 * Created on May 28, 2015
 */
abstract public class Card {

    public Card(int CardId) {
        this.CardId = CardId;
        this.Showing = false;
    }
    
    private int CardId;

    /**
     * Get the value of CardId
     *
     * @return the value of CardId
     */
    public int getCardId() {
        return CardId;
    }

    /**
     * Set the value of CardId
     *
     * @param CardId new value of CardId
     */
    public void setCardId(int CardId) {
        this.CardId = CardId;
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
    }

    /**
     * Make the card turn
     * 
     * @return the position after flipping the card
     */
    boolean Flip() {
        this.setShowing(!(this.isShowing()));
        return isShowing();
    }
    
    /**
     * 
     */
    void Show() {
        this.Flip();
        //TODO
    }
    
    abstract void OnOpen();
    abstract void OnThrow();
    abstract boolean isSpecialCard();
    
}
