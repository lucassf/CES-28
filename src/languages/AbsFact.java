
package languages;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AbsFact {
    public static final int ENGLISH = 1;
    public static final int PORTUGUESE = 2;
    private  static Map<String,LanguageKit> portMap = new HashMap<String,LanguageKit>();
    private  static Map<String,LanguageKit> engMap = new HashMap<String,LanguageKit>();
    
    private static Map<String,LanguageKit> clones = new HashMap<String,LanguageKit>();
    private static LanguageKit portKit = new PortugueseKit();
    private static LanguageKit engKit = new EnglishKit();
    private static LanguageKit kit;
    
    public AbsFact(){
        portMap.put("simple phone", new PortKitSimplePhone());
        portMap.put("complex phone", new PortKitComplexPhone());
        engMap.put("simple phone", new EnglishKitSimplePhone());
        engMap.put("complex phone", new EnglishKitComplexPhone());
        clones = portMap;
        portKit = (LanguageKit) clones.get("simple phone").cloneLang();
    }
    
    public static LanguageKit getFactory(int n){
        switch(n){
            case ENGLISH:
                kit = engKit;
                clones = engMap;
                return kit;
            case PORTUGUESE:
                kit = portKit;
                clones = portMap;
                return kit;
        }
        
        return null;
    }
    
    public LanguageKit changeToSimplePhone(){
        kit = (LanguageKit) clones.get("simple phone").cloneLang();
        return kit;
    }
    
    public LanguageKit changeToComplexPhone(){
        kit = (LanguageKit) clones.get("complex phone").cloneLang();
        return kit;
    }
}
