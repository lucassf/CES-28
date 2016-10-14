package lab3;

public class Director {
    private LetterBuilder _letterbuilder;
    
    public void setBuilder(LetterBuilder letterBuilder){
        this._letterbuilder = letterBuilder;
    }
    
    public void setData(Person sender,Person destinatary,String date){
        _letterbuilder.setSender(sender);
        _letterbuilder.setDestinatary(destinatary);
        _letterbuilder.setDate(date);
    }
    
    public String model() {
        return _letterbuilder.header() + _letterbuilder.body() + 
                _letterbuilder.conclusion() + _letterbuilder.signature();
    }
}
