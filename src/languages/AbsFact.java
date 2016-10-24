
package languages;

import java.util.HashMap;
import java.util.Map;

public class AbsFact {
    private  static Map<String,LanguageKit> portMap = new HashMap<String,LanguageKit>();
    private  static Map<String,LanguageKit> engMap = new HashMap<String,LanguageKit>();
    
    private static Map<String,LanguageKit> clones;
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
    
    public static LanguageKit getFactory(Language language){
        switch(language){
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
        kit = clones.get("complex phone").cloneLang();
        return kit;
    }
    
    public LanguageKit changeToComplexPhone(){
        kit = clones.get("complex phone").cloneLang();
        return kit;
    }
}
