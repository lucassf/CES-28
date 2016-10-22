 package languages;
 
import lab3.Address;

public abstract class LanguageKit {
    public static final int ENGLISH = 1;
    public static final int PORTUGUESE = 2;
    
    public static LanguageKit getFactory(int n){
        switch(n){
            case ENGLISH:
                return new EnglishKit();
            case PORTUGUESE:
                return new PortugueseKit();
        }
        
        return null;
    }
    
    public abstract String formatDate();
    public abstract String formatName(String name);
    public abstract String formatPhone(String phone);
    public abstract String formatAddress(Address address);
}
