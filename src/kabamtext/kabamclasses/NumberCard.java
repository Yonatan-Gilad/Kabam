/*
 * All rights reserved to Yonatan Kaminsky and Gilad Kinory
 */

package kabamtext.kabamclasses;

/**
 *
 * @author Yonatan
 * Created on May 29, 2015
 */
public class NumberCard extends Card{

    public NumberCard(int CardId, int value) {
        super(CardId);
        this.value = value;
    }
    
    int value;

    @Override
    void OnOpen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void OnThrow() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    boolean isSpecialCard() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
