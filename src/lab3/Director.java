package lab3;

public class Director {
    private LetterBuilder _letterbuilder;
    private LanguageKit _lang;
    
    public void setBuilder(LetterBuilder letterBuilder, int language){
        _lang = LanguageKit.getFactory(language);
        this._letterbuilder = letterBuilder;
    }
    
    public void setData(Person sender,Person destinatary,String date){
        _lang.formatPerson(sender);
        _lang.formatPerson(destinatary);
        _lang.formatDate(date);
        _letterbuilder.setSender(sender);
        _letterbuilder.setDestinatary(destinatary);
        _letterbuilder.setDate(date);
    }
    
    public String model() {
        return _letterbuilder.header() + _letterbuilder.body() + 
                _letterbuilder.conclusion() + _letterbuilder.signature();
    }
}
