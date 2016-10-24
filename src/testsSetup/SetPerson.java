package testsSetup;

import lab3.Address;
import lab3.Person;
import static org.mockito.Mockito.when;

public class SetPerson {
    public static void setUp(Person _sender,Person _destinatary){
        when(_sender.getAddress()).thenReturn(new Address("A","H18C","112","180-880","SJC","CTA"));
        when(_sender.getEmail()).thenReturn("www.ls@ita.br");
        when(_sender.getName()).thenReturn("Lucas");
        when(_sender.getPhone()).thenReturn("982872996");
        
        when(_destinatary.getAddress()).thenReturn(new Address("B","avSatelite","1","180-881","SJC","jardim Satelite"));
        when(_destinatary.getEmail()).thenReturn("www.fui@ita.br");
        when(_destinatary.getName()).thenReturn("Gabriel");
        when(_destinatary.getPhone()).thenReturn("982432996");
    }
}
