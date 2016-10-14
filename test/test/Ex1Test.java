package test;

import lab3.*;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Ex1Test {
    
    private static Person _sender;
    private static Person _destinatary;
    private static Director _director;
    private static LetterBuilder letterbuilder;
    
    @BeforeClass
    public static void setUp(){
        _sender= mock(Person.class);
        _destinatary = mock(Person.class);
        _director = new Director();
        
        when(_sender.getAddress()).thenReturn("Rua H18C, 112, CTA");
        when(_sender.getEmail()).thenReturn("www.ls@ita.br");
        when(_sender.getName()).thenReturn("Lucas");
        when(_sender.getPhone()).thenReturn("982872996");
        
        when(_destinatary.getAddress()).thenReturn("av. Satelite,230,SJC");
        when(_destinatary.getEmail()).thenReturn("www.fui@ita.br");
        when(_destinatary.getName()).thenReturn("Gabriel");
        when(_destinatary.getPhone()).thenReturn("982432996");
    }
    
    @Test
    public void comercialModelTest(){
        String text;
        
        letterbuilder = new ComercialLetterBuilder();
        
        _director.setBuilder(letterbuilder);
        _director.setData(_sender, _destinatary, "14/10/2016");
        
        text = "14/10/2016\n\n"+ _sender.getName() + "\n"+
                _sender.getAddress() + "\n" + _destinatary.getName()+ "\n"+
                _destinatary.getAddress()+  "\n"+
                "Dear "+_destinatary.getName()+"\n"+
                "\nSincerely,\n"+_sender.getName();
        
        assertEquals(text,_director.model());
    }
    
    @Test
    public void InformalModelTest(){
        String text;
        
        letterbuilder = new InformalLetterBuilder();
        
        _director.setBuilder(letterbuilder);
        _director.setData(_sender, _destinatary, "15/10/2016");
        
        text = "By "+_sender.getName()+"; "+_sender.getAddress()+
                "\nTo "+_destinatary.getName()+"; "+_destinatary.getAddress()+
                "\n\n"+_destinatary.getName()+",\n"+
                "\nBest Wishes,\n"+_sender.getName()+"\nSent: 15/10/2016";
        
        //System.out.println(text);
        assertEquals(text,_director.model());
    }
    
    @Test
    public void GlitteryModelTest(){
        String text;
        
        letterbuilder = new InformalLetterBuilder();
        
        _director.setBuilder(letterbuilder);
        _director.setData(_sender, _destinatary, "15/10/2016");
        
        text = "By "+_sender.getName()+"; "+_sender.getAddress()+
                "\nTo "+_destinatary.getName()+"; "+_destinatary.getAddress()+
                "\n\n"+_destinatary.getName()+",\n"+
                "\nBest Wishes,\n"+_sender.getName()+"\nSent: 15/10/2016";
        
        //System.out.println(text);
        assertEquals(text,_director.model());
    }
}
