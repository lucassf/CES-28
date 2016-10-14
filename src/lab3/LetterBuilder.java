package lab3;

import java.util.Date;

public abstract class LetterBuilder {
    
    protected Person _sender;
    protected Person _destinatary;
    protected String _date;
    
    protected abstract String header();
    protected abstract String body();
    protected abstract String conclusion();
    protected abstract String signature();

    public void setSender(Person _sender) {
        this._sender = _sender;
    }

    public void setDestinatary(Person _destinatary) {
        this._destinatary = _destinatary;
    }

    public void setDate(String _date) {
        this._date = _date;
    }
}
