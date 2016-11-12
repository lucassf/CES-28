package letterFormat;

public class ComercialLetterBuilder extends LetterBuilder {

    @Override
    public String header() {
        return strDate() + "\n\n" + senderName() + "\n"+
                senderAddress()+ "\n" + senderPhone()+"\n"+destinataryName()+ "\n"+
                destinataryAddress()+ "\n" + destinataryPhone() + "\n\n";

    }

    @Override
    public String body() {
        return "Dear "+destinataryName()+"\n";
    }

    @Override
    public String conclusion() {
        return "\nSincerely,\n";
    }

    @Override
    public String signature() {
        return senderName();
    }

}
