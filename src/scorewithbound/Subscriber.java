/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package scorewithbound;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
/**
 *
 * @author ZETPOM
 */
public class Subscriber implements PropertyChangeListener{
    @Override
    public void propertyChange(PropertyChangeEvent evt){
        System.out.println("live result: " + evt.getNewValue());
    }
}
