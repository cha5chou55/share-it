package services.impl;

import javax.ejb.Stateless;
import services.interfaces.GreetingServicesLocal;
import services.interfaces.GreetingServicesRemote;

/**
 * Session Bean implementation class GreetingServices
 */
@Stateless
public class GreetingServices implements GreetingServicesRemote, GreetingServicesLocal {

    /**
     * Default constructor. 
     */
    public GreetingServices() {
        // TODO Auto-generated constructor stub
    }

}
