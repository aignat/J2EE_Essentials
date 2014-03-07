
package controller;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Named;

@Stateless
@Named
public class CustomerSessionBean {
    
    public List<String> getCustomerNames() {
        List<String> nume = new ArrayList<String>();
        
        nume.add("Nume 1");
        nume.add("Nume 2");
        nume.add("Nume 3");
        nume.add("Nume 4");
        
        return nume;
    }
}
