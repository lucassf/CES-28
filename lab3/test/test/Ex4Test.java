package test;

import testsSetup.SetPerson;
import letterFormat.ComercialLetterBuilder;
import letterFormat.LetterBuilder;
import lab3.*;
import languages.Language;
import java.util.Date;
import java.text.SimpleDateFormat;
import letterFormat.InformalLetterBuilder;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import static org.mockito.Mockito.mock;

public class Ex4Test {
    
    private static Person _sender;
    private static Person _destinatary;
    private static Director _director;
    private static LetterBuilder _letterbuilder;
    private static Date _date;
    private static String strDatePortuguese;
    
    @BeforeClass
    public static void setUp(){
        _sender= mock(Person.class);
        _destinatary = mock(Person.class);
        _director = new Director();
        _date = new Date();
        strDatePortuguese = (new SimpleDateFormat("dd-MM-yyyy")).format(_date);
        SetPerson.setUp(_sender, _destinatary);
    }
    
    @Test
    public void ChangingLetterModelsMultiplePhoneSubparts(){
        String text;
        
        _letterbuilder = new ComercialLetterBuilder();
        
        _director.setBuilder(_letterbuilder);
        _director.changeLanguage(Language.PORTUGUESE);
        _director.changeComplexPhone();
        _director.setData(_sender, _destinatary, _date);
        
        
        text = strDatePortuguese +"\n"+
            "\n" +
            "Sr. Lucas\n" +
            "A:Rua H18C,112, CTA SJC;180-880\n" +
            "DDD: 98 Tel: 28729.9600\n" +
            "Sr. Gabriel\n" +
            "B:Rua avSatelite,1, jardim Satelite SJC;180-881\n" +
            "DDD: 98 Tel: 24329.9600\n" +
            "\n" +
            "Dear Sr. Gabriel\n" +
            "\n" +
            "Sincerely,\n" +
            "Sr. Lucas";
        assertEquals(text,_director.model());
        
        _director.setBuilder(new InformalLetterBuilder());
        _director.setData(_sender, _destinatary, _date);
        
        text = "By Sr. Lucas; A:Rua H18C,112, CTA SJC;180-880;DDD: 98 Tel: 28729.9600\n" +
            "To Sr. Gabriel; B:Rua avSatelite,1, jardim Satelite SJC;180-881;DDD: 98 Tel: 24329.9600\n" +
            "\n" +
            "Sr. Gabriel,\n" +
            "\n" +
            "Best Wishes,\n" +
            "Sr. Lucas\n" +
            "Sent: "+strDatePortuguese;
        assertEquals(text,_director.model());
        
    }
}
