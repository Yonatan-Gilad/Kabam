/*
 * All rights reserved to Yonatan Kaminsky and Gilad Kinory
 */
package kabamtext.kabamclasses;

/**
 *
 * @author Yonatan Created on May 28, 2015
 */
public class Game {

    public Game(Player[] Players) {
        this.Players = Players;
        this.CardDeck = new Deck(false, 55);
        this.PopulateCardDeck();
        this.ThrowPile = new Deck(true, 0);
        this.TurnId = 0;
        this.Kabam = false;
        this.KabamStarter = null;
    }

    private Player[] Players;

    /**
     * Get the value of Players
     *
     * @return the value of Players
     */
    public Player[] getPlayers() {
        return Players;
    }

    /**
     * Set the value of Players
     *
     * @param Players new value of Players
     */
    public void setPlayers(Player[] Players) {
        this.Players = Players;
    }

    /**
     * Get the value of Players at specified index
     *
     * @param index the index of Players
     * @return the value of Players at specified index
     */
    public Player getPlayers(int index) {
        return this.Players[index];
    }

    /**
     * Set the value of Players at specified index.
     *
     * @param index the index of Players
     * @param Players new value of Players at specified index
     */
    public void setPlayers(int index, Player Players) {
        this.Players[index] = Players;
    }

    private Deck CardDeck;

    /**
     * Get the value of CardDeck
     *
     * @return the value of CardDeck
     */
    public Deck getCardDeck() {
        return CardDeck;
    }

    /**
     * Set the value of CardDeck
     *
     * @param CardDeck new value of CardDeck
     */
    public void setCardDeck(Deck CardDeck) {
        this.CardDeck = CardDeck;
    }

    private Deck ThrowPile;

    /**
     * Get the value of ThrowPile
     *
     * @return the value of ThrowPile
     */
    public Deck getThrowPile() {
        return ThrowPile;
    }

    /**
     * Set the value of ThrowPile
     *
     * @param ThrowPile new value of ThrowPile
     */
    public void setThrowPile(Deck ThrowPile) {
        this.ThrowPile = ThrowPile;
    }

    private int TurnId;

    /**
     * Get the value of TurnId
     *
     * @return the value of TurnId
     */
    public int getTurnId() {
        return TurnId;
    }

    /**
     * Set the value of TurnId
     *
     * @param TurnId new value of TurnId
     */
    public void setTurnId(int TurnId) {
        this.TurnId = TurnId;
    }

    private boolean Kabam;

    /**
     * Get the value of Kabam
     *
     * @return the value of Kabam
     */
    public boolean isKabam() {
        return Kabam;
    }

    /**
     * Set the value of Kabam
     *
     * @param Kabam new value of Kabam
     */
    public void setKabam(boolean Kabam) {
        this.Kabam = Kabam;
    }

    private Player KabamStarter;

    /**
     * Get the value of KabamStarter
     *
     * @return the value of KabamStarter
     */
    public Player getKabamStarter() {
        return KabamStarter;
    }

    /**
     * Set the value of KabamStarter
     *
     * @param KabamStarter new value of KabamStarter
     */
    public void setKabamStarter(Player KabamStarter) {
        this.KabamStarter = KabamStarter;
    }

    //  Functions
    /**
     *
     * @return The first card in the card deck
     */
    public Card getCardFromCardDeck() {
        return CardDeck.getCard();
    }

    /**
     *
     * @return The last thrown card in the throw pile
     */
    public Card getCardFromThrowPile() {
        return ThrowPile.getCard();
    }

    public void PlayTurn(Player p) {

    }

    private void PopulateCardDeck() {
        for (int CardValue = 1; CardValue <= 6; CardValue++) {
            for (int SubId = 0; SubId < 4; SubId++) {
                int CardId = (CardValue-1)*4 + SubId;
                this.getCardDeck().add(new NumberCard(CardId, CardValue));
            }
        }
        //Todo
        
    }

}
