package languages;

import lab3.Address;

public class EnglishKit extends LanguageKit{

    @Override
    public String formatDate() {
        return "MM-dd-yyyy";
    }

    @Override
    public String formatName(String name) {
        return "Mr. "+name;
    }
    
    @Override
    public String formatPhone(String phone) {
        String _phone;
        while (phone.length()<9){
            phone+="0";
        }
        _phone = phone.substring(0, 3)+"-"+phone.substring(3, 6)+"-"+phone.substring(6, 9);
        return _phone;
    }

    @Override
    public String formatAddress(Address address) {
        String aux;
        aux = address.getName()+","+
                address.getNumber()+" "+address.getStreet()+","+
                address.getCity()+" "+address.getState()+" "+address.getZip();
        return aux;
    }
    
    @Override
    public LanguageKit cloneLang(){
        return new EnglishKit();
    }
    
}
