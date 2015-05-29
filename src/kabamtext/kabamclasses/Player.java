/*
 * All rights reserved to Yonatan Kaminsky and Gilad Kinory
 */
package kabamtext.kabamclasses;

/**
 *
 * @author Yonatan Created on May 28, 2015
 */
public class Player {

    public Player(String Name, boolean PlayingUser) {
        this.Name = Name;
        this.PlayingUser = PlayingUser;
        this.Cards = new Card[4];
    }
    
    // The name of the player
    private String Name;

    /**
     * Get the value of Name
     *
     * @return the value of Name
     */
    public String getName() {
        return Name;
    }

    /**
     * Set the value of Name
     *
     * @param Name new value of Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    // A boolean stating if the player is the user or not
    private boolean PlayingUser;

    /**
     * Get the value of PlayingUser
     *
     * @return the value of PlayingUser
     */
    public boolean isPlayingUser() {
        return PlayingUser;
    }

    /**
     * Set the value of PlayingUser
     *
     * @param PlayingUser new value of PlayingUser
     */
    public void setPlayingUser(boolean PlayingUser) {
        this.PlayingUser = PlayingUser;
    }
    
    private Card[] Cards;

    /**
     * Get the value of Cards
     *
     * @return the value of Cards
     */
    public Card[] getCards() {
        return Cards;
    }

    /**
     * Set the value of Cards
     *
     * @param Cards new value of Cards
     */
    public void setCards(Card[] Cards) {
        this.Cards = Cards;
    }

    /**
     * Get the value of Card at specified index
     *
     * @param index the index of Cards
     * @return the value of Cards at specified index
     */
    public Card getCard(int index) {
        return this.Cards[index];
    }

    /**
     * Set the value of Card at specified index.
     *
     * @param index the index of Cards
     * @param Cards new value of Cards at specified index
     */
    public void setCard(int index, Card Cards) {
        this.Cards[index] = Cards;
    }


    public Card SwitchCard(Card card, int LocationInArray) {
        Card CurrentCard = this.getCard(LocationInArray);
        this.setCard(LocationInArray, card);
        return CurrentCard;
    }
    
    public Card ShowCard(int CardLocationInArray) {
        Card ChosenCard = this.getCard(CardLocationInArray);
        ChosenCard.Flip();
        return ChosenCard;
    }
    
}
