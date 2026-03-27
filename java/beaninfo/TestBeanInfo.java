package beaninfo;

import java.beans.*;
import beans.Person;

public class TestBeanInfo {
    public static void main(String[] args) throws Exception {

        BeanInfo info = Introspector.getBeanInfo(Person.class);

        for (PropertyDescriptor pd : info.getPropertyDescriptors()) {
            System.out.println("Property: " + pd.getName());
        }
    }
}