
package languages;


public class EnglishKitComplexPhone extends EnglishKit{
    
    @Override
    public String formatPhone(String phone) {
        String _phone;
        while (phone.length()<11){
            phone+="0";
        }
        _phone = "DDD: "+phone.substring(0, 2)+" Tel: "+phone.substring(2, 7)+"."+phone.substring(7, 11);
        return _phone;
    }
    
    @Override
    public PortKitComplexPhone cloneLang(){
        return new PortKitComplexPhone();
    }
}
