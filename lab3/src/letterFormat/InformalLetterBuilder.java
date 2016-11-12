package letterFormat;

public class InformalLetterBuilder extends LetterBuilder{
    
    @Override
    public String header() {
        return "By "+senderName()+"; "+senderAddress()+";"+senderPhone()+
                "\nTo "+destinataryName()+"; "+destinataryAddress()+";"+
                destinataryPhone()+"\n\n";
    }

    @Override
    public String body() {
        return destinataryName()+",\n";
    }

    @Override
    public String conclusion() {
        return "\nBest Wishes,\n";
    }

    @Override
    public String signature() {
        return senderName()+"\nSent: "+strDate();
    }
}
