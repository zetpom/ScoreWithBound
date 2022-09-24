/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package scorewithbound;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author ZETPOM
 */
public class ScoreBean implements Serializable {

    public static final String SCORE_LINE_PROPERTY = "scoreLine";

    private String scoreLine;

    private PropertyChangeSupport propertySupport;

    public ScoreBean() {
        propertySupport = new PropertyChangeSupport(this);
    }

    public String getScoreLine() {
        return scoreLine;
    }

    public void setScoreLine(String value) {
        String oldScoreLine = scoreLine;
        scoreLine = value;
        propertySupport.firePropertyChange(SCORE_LINE_PROPERTY, oldScoreLine, scoreLine);
    }


    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }

}
