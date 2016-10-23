 package languages;
 
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import lab3.Address;

public abstract class LanguageKit {
   
    public abstract String formatDate();
    public abstract String formatName(String name);
    public abstract String formatPhone(String phone);
    public abstract String formatAddress(Address address);
    public abstract LanguageKit cloneLang();
}
