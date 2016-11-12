package test;

import testsSetup.SetPerson;
import letterFormat.ComercialLetterBuilder;
import letterFormat.LetterBuilder;
import letterFormat.InformalLetterBuilder;
import letterFormat.GlitteryLetterBuilder;
import lab3.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import static org.mockito.Mockito.mock;

public class Ex1Test {
    
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
    public void EnglishComercialModel(){
        String text;
        
        _letterbuilder = new ComercialLetterBuilder();
        
        _director.setBuilder(_letterbuilder);
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
        
        _director.setBuilder(_letterbuilder);
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
        
        _director.setBuilder(_letterbuilder);
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
}
