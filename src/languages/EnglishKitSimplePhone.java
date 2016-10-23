
package languages;

public class EnglishKitSimplePhone extends EnglishKit{
    @Override
    public String formatPhone(String phone) {
        String _phone = phone;
        while (phone.length()<11){
            phone+="0";
        }
        _phone = "("+phone.substring(0, 2)+")"+phone.substring(2, 7)+"-"+phone.substring(7, 11);
        return _phone;
    }
    
    @Override
    public EnglishKitSimplePhone cloneLang(){
        return new EnglishKitSimplePhone();
    }
}
