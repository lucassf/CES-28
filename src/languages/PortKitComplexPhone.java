
package languages;

public class PortKitComplexPhone extends PortugueseKit{
    
    public PortKitComplexPhone(){
        
    }
    
    @Override
    public String formatPhone(String phone) {
        String _phone = phone;
        while (phone.length()<11){
            phone+="0";
        }
        _phone = "DDD: "+phone.substring(0, 2)+" Tel: "+phone.substring(2, 7)+"."+phone.substring(7, 11);
        return _phone;
    }
    
    public PortKitComplexPhone cloneLang(){
        return new PortKitComplexPhone();
    }
}
