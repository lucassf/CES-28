package lab3;

public class GlitteryLetterBuilder extends LetterBuilder{
    
    private String formatCenter = "*%1$-30*";
    private String formatTop = "******************************";
    
    @Override
    protected String header() {
        return formatTop+"\n"+String.format(formatCenter, "From " + _sender.getName()+
                " to "+_destinatary.getName()+"\n"+_date+"\n\n");
    }

    @Override
    protected String body() {
        return String.format(formatTop, "Dear "+_destinatary.getName()+"\n");
    }

    @Override
    protected String conclusion() {
        return String.format(formatTop, "See you soon\n");
    }

    @Override
    protected String signature() {
        return String.format(formatTop, _sender.getName())+formatTop;
    }
}
