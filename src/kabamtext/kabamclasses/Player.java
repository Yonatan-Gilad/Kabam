/*
 * All rights reserved to Yonatan Kaminsky and Gilad Kinory
 */
package kabamtext.kabamclasses;

/**
 *
 * @author Yonatan Created on May 28, 2015
 */
public class Player {

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

    
}
