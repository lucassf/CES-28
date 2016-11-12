package test;

import testsSetup.SetPerson;
import letterFormat.ComercialLetterBuilder;
import letterFormat.LetterBuilder;
import letterFormat.InformalLetterBuilder;
import lab3.*;
import languages.Language;
import java.util.Date;
import java.text.SimpleDateFormat;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import static org.mockito.Mockito.mock;

public class Ex23Test {
    
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
        SetPerson.setUp(_sender, _destinatary);
    }
    
    @Test
    public void PortugueseComercialModel(){
        String text;
        
        _letterbuilder = new ComercialLetterBuilder();
        
        _director.changeLanguage(Language.PORTUGUESE);
        _director.setBuilder(_letterbuilder);
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
    public void PortugueseInformalModelChangeToEnglish(){
        String text;
        
        _letterbuilder = new InformalLetterBuilder();
        
        _director.changeLanguage(Language.PORTUGUESE);
        _director.setBuilder(_letterbuilder);
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
        
        _director.changeLanguage(Language.ENGLISH);
        
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
}
