package lab3;

public class InformalLetterBuilder extends LetterBuilder{
    
    @Override
    protected String header() {
        return "By "+_sender.getName()+"; "+_sender.getAddress()+
                "\nTo "+_destinatary.getName()+"; "+_destinatary.getAddress()+
                "\n\n";
    }

    @Override
    protected String body() {
        return _destinatary.getName()+",\n";
    }

    @Override
    protected String conclusion() {
        return "\nBest Wishes,\n";
    }

    @Override
    protected String signature() {
        return _sender.getName()+"\nSent: "+_date;
    }
}
