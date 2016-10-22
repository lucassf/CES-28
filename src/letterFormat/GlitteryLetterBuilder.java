package letterFormat;

public class GlitteryLetterBuilder extends LetterBuilder{
    
    private String formatCenter = "*%1$-40s*";
    private String formatTop = "******************************************";
    
    @Override
    public String header() {
        return formatTop+"\n"+glitterFormat("From " + senderName()+
                " to "+destinataryName())+"\n"+glitterFormat(strDate())+"\n"+
                glitterFormat("")+"\n";
    }
    
    private String glitterFormat(String value){
        return String.format(formatCenter,value);
    }

    @Override
    public String body() {
        return glitterFormat("Dear "+destinataryName())+"\n"+glitterFormat("")+"\n";
    }

    @Override
    public String conclusion() {
        return glitterFormat("See you soon")+"\n";
    }

    @Override
    public String signature() {
        return glitterFormat(senderName())+"\n"+formatTop;
    }
}
