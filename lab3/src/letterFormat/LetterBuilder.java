package letterFormat;

import java.text.SimpleDateFormat;
import java.util.Date;
import languages.LanguageKit;
import lab3.Person;

public abstract class LetterBuilder {
    
    protected Person _sender;
    protected Person _destinatary;
    
    private LanguageKit _lang;
    private Date _date;
    
    public abstract String header();
    public abstract String body();
    public abstract String conclusion();
    public abstract String signature();

    public void setSender(Person _sender) {
        this._sender = _sender;
    }

    public void setDestinatary(Person _destinatary) {
        this._destinatary = _destinatary;
    }

    public void setDate(Date _date) {
        this._date = _date;
    }

    public void setLang(LanguageKit _lang) {
        this._lang = _lang;
    }
    
    //Below methods that converts string in a format correspondent to current
    //language
    
    protected String senderName(){
        return _lang.formatName(_sender.getName());
    }
    
    protected String destinataryName(){
        return _lang.formatName(_destinatary.getName());
    }
    
    protected String senderPhone(){
        return _lang.formatPhone(_sender.getPhone());
    }
    
    protected String destinataryPhone(){
        return _lang.formatPhone(_destinatary.getPhone());
    }
    
    protected String senderAddress(){
        return _lang.formatAddress(_sender.getAddress());
    }
    
    protected String destinataryAddress(){
        return _lang.formatAddress(_destinatary.getAddress());
    }
    
    protected String strDate(){
        return (new SimpleDateFormat(_lang.formatDate())).format(_date);
    }
}
