package constrained;

import java.beans.*;

public class TestConstrained {
    public static void main(String[] args) {

        ConstrainedPerson p = new ConstrainedPerson();

        p.addVetoableChangeListener(new VetoableChangeListener() {
            public void vetoableChange(PropertyChangeEvent evt) throws PropertyVetoException {

                int newAge = (int) evt.getNewValue();

                if (newAge < 18) {
                    throw new PropertyVetoException("Age cannot be less than 18!", evt);
                }
            }
        });

        try {
            p.setAge(20);
            System.out.println("Age set to 20");

            p.setAge(15); // This will throw exception

        } catch (PropertyVetoException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
