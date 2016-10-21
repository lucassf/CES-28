 package lab3;

public abstract class LanguageKit {
    private static final int ENGLISH = 1;
    private static final int PORTUGUESE = 2;
    private static final int GERMAN = 3;
    private static final EnglishKit _englishKit = new EnglishKit();
    
    public static LanguageKit getFactory(int n){
        switch(n){
            case ENGLISH:
                return _englishKit;
        }
        
        return null;
    }
    
    
    public abstract void formatPerson(Person person);
    
    public abstract void formatDate(String date);
}
