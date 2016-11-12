package lab3;

import letterFormat.LetterBuilder;
import java.util.Date;
import languages.AbsFact;
import languages.Language;
import languages.LanguageKit;

public class Director {
    private LetterBuilder _letterbuilder;
    private LanguageKit _languagekit;
    private final AbsFact _factory = new AbsFact();
    
    public Director(){
        _languagekit = AbsFact.getFactory(Language.ENGLISH);
    }
    
    public void setBuilder(LetterBuilder letterBuilder){
        this._letterbuilder = letterBuilder;
        updateBuilderLanguage();
    }
    
    private void updateBuilderLanguage(){
        if (_letterbuilder!=null){
            _letterbuilder.setLang(_languagekit);
        }
    }
    
    public void changeLanguage(Language language){
        _languagekit = AbsFact.getFactory(language);
        updateBuilderLanguage();
    }
    
    public void changeComplexPhone(){
        _languagekit = _factory.changeToComplexPhone();
        updateBuilderLanguage();
    }
    
    public void changeSimplePhone(){
        _languagekit = _factory.changeToSimplePhone();
        updateBuilderLanguage();
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
