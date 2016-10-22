package lab3;

import languages.LanguageKit;
import letterFormat.LetterBuilder;
import java.util.Date;

public class Director {
    private LetterBuilder _letterbuilder;
    
    public void setBuilder(LetterBuilder letterBuilder, int language){
        this._letterbuilder = letterBuilder;
        _letterbuilder.setLang(LanguageKit.getFactory(language));
    }
    
    public void setData(Person sender,Person destinatary,Date date){
        _letterbuilder.setSender(sender);
        _letterbuilder.setDestinatary(destinatary);
        _letterbuilder.setDate(date);
    }
    
    public String model() {
        return _letterbuilder.header() + _letterbuilder.body() + 
                _letterbuilder.conclusion() + _letterbuilder.signature();
    }
}
