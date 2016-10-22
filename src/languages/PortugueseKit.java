package languages;

import lab3.Address;

public class PortugueseKit extends LanguageKit{

    @Override
    public String formatDate() {
        return "dd-MM-yyyy";
    }

    @Override
    public String formatName(String name) {
        return "Sr. "+name;
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
    public String formatAddress(Address address) {
        String aux;
        aux = address.getName()+":"+"Rua "+
                address.getStreet()+","+address.getNumber()+", "+
                address.getCity()+" "+address.getState()+";"+address.getZip();
        return aux;
    }
    
}
