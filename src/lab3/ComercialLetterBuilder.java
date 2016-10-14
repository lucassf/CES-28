package lab3;

import java.util.Date;

public class ComercialLetterBuilder extends LetterBuilder {

    @Override
    protected String header() {
        return _date + "\n\n" + _sender.getName() + "\n"+
                _sender.getAddress() + "\n" + _destinatary.getName()+ "\n"+
                _destinatary.getAddress()+ "\n";

    }

    @Override
    protected String body() {
        return "Dear "+_destinatary.getName()+"\n";
    }

    @Override
    protected String conclusion() {
        return "\nSincerely,\n";
    }

    @Override
    protected String signature() {
        return _sender.getName();
    }

}
