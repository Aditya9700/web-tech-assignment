package bound;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class TestBound {
    public static void main(String[] args) {

        BoundPerson p = new BoundPerson();

        p.addPropertyChangeListener(new PropertyChangeListener() {
            public void propertyChange(PropertyChangeEvent evt) {
                System.out.println("Property changed: " 
                    + evt.getPropertyName() +
                    ", Old: " + evt.getOldValue() +
                    ", New: " + evt.getNewValue());
            }
        });

        p.setName("Aditya");
        p.setName("Rana");
    }
}
