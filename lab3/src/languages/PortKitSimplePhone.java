
package languages;

public class PortKitSimplePhone extends PortugueseKit{
    
    public PortKitSimplePhone(){
    }
    
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
    public PortKitSimplePhone cloneLang(){
        return new PortKitSimplePhone();
    }
}
