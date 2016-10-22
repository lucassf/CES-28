package test;

import java.text.SimpleDateFormat;
import letterFormat.ComercialLetterBuilder;
import letterFormat.LetterBuilder;
import letterFormat.InformalLetterBuilder;
import java.util.Date;
import lab3.*;
import letterFormat.GlitteryLetterBuilder;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PTest {
    
    private static Person _sender;
    private static Person _destinatary;
    private static Director _director;
    private static LetterBuilder _letterbuilder;
    private static Date _date;
    private static String strDateEnglish;
    private static String strDatePortuguese;
    
    @BeforeClass
    public static void setUp(){
        _sender= mock(Person.class);
        _destinatary = mock(Person.class);
        _director = new Director();
        _date = new Date();
        strDateEnglish = (new SimpleDateFormat("MM-dd-yyyy")).format(_date);
        strDatePortuguese = (new SimpleDateFormat("dd-MM-yyyy")).format(_date);
        
        when(_sender.getAddress()).thenReturn(new Address("A","H18C","112","180-880","SJC","CTA"));
        when(_sender.getEmail()).thenReturn("www.ls@ita.br");
        when(_sender.getName()).thenReturn("Lucas");
        when(_sender.getPhone()).thenReturn("982872996");
        
        when(_destinatary.getAddress()).thenReturn(new Address("B","avSatelite","1","180-881","SJC","jardim Satelite"));
        when(_destinatary.getEmail()).thenReturn("www.fui@ita.br");
        when(_destinatary.getName()).thenReturn("Gabriel");
        when(_destinatary.getPhone()).thenReturn("982432996");
    }
    
    @Test
    public void EnglishComercialModel(){
        String text;
        
        _letterbuilder = new ComercialLetterBuilder();
        
        _director.setBuilder(_letterbuilder,1);
        _director.setData(_sender, _destinatary, _date);
        
        
        text = strDateEnglish +"\n"+
            "\n" +
            "Mr. Lucas\n" +
            "A,112 H18C,CTA SJC 180-880\n" +
            "982-872-996\n" +
            "Mr. Gabriel\n" +
            "B,1 avSatelite,jardim Satelite SJC 180-881\n" +
            "982-432-996\n" +
            "\n" +
            "Dear Mr. Gabriel\n" +
            "\n" +
            "Sincerely,\n" +
            "Mr. Lucas";
        assertEquals(text,_director.model());
    }
    
    @Test
    public void EnglishInformalModel(){
        String text;
        
        _letterbuilder = new InformalLetterBuilder();
        
        _director.setBuilder(_letterbuilder,1);
        _director.setData(_sender, _destinatary, _date);
        
        text = "By Mr. Lucas; A,112 H18C,CTA SJC 180-880;982-872-996\n" +
            "To Mr. Gabriel; B,1 avSatelite,jardim Satelite SJC 180-881;982-432-996\n" +
            "\n" +
            "Mr. Gabriel,\n" +
            "\n" +
            "Best Wishes,\n" +
            "Mr. Lucas\n" +
            "Sent: "+strDateEnglish;
        assertEquals(text,_director.model());
    }
    
    @Test
    public void EnglishGlitteryModel(){
        String text;
        
        _letterbuilder = new GlitteryLetterBuilder();
        
        _director.setBuilder(_letterbuilder,1);
        _director.setData(_sender, _destinatary, _date);
        
        text = 
            "******************************************\n" +
            "*From Mr. Lucas to Mr. Gabriel           *\n" +
            "*"+strDateEnglish+"                              *\n" +
            "*                                        *\n" +
            "*Dear Mr. Gabriel                        *\n" +
            "*                                        *\n" +
            "*See you soon                            *\n" +
            "*Mr. Lucas                               *\n" +
            "******************************************";
        assertEquals(text,_director.model());
    }
    
    @Test
    public void PortugueseComercialModel(){
        String text;
        
        _letterbuilder = new ComercialLetterBuilder();
        
        _director.setBuilder(_letterbuilder,2);
        _director.setData(_sender, _destinatary, _date);
        
        
        text = strDatePortuguese +"\n"+
            "\n" +
            "Sr. Lucas\n" +
            "A:Rua H18C,112, CTA SJC;180-880\n" +
            "(98)28729-9600\n" +
            "Sr. Gabriel\n" +
            "B:Rua avSatelite,1, jardim Satelite SJC;180-881\n" +
            "(98)24329-9600\n" +
            "\n" +
            "Dear Sr. Gabriel\n" +
            "\n" +
            "Sincerely,\n" +
            "Sr. Lucas";
        assertEquals(text,_director.model());
        
    }
    
    @Test
    public void PortugueseInformalModel(){
        String text;
        
        _letterbuilder = new InformalLetterBuilder();
        
        _director.setBuilder(_letterbuilder,2);
        _director.setData(_sender, _destinatary, _date);
        
        text = "By Sr. Lucas; A:Rua H18C,112, CTA SJC;180-880;(98)28729-9600\n" +
            "To Sr. Gabriel; B:Rua avSatelite,1, jardim Satelite SJC;180-881;(98)24329-9600\n" +
            "\n" +
            "Sr. Gabriel,\n" +
            "\n" +
            "Best Wishes,\n" +
            "Sr. Lucas\n" +
            "Sent: "+strDatePortuguese;
        assertEquals(text,_director.model());
    }
}
