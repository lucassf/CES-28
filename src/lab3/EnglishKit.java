package lab3;

public class EnglishKit extends LanguageKit{

    @Override
    public void formatPerson(Person person) {
        String phone;
        String aux;
        person.setName("Mr. " + person.getName());
        
        phone = person.getPhone();
        phone = phone+"0";
        phone = phone.substring(0, 3)+"-"+phone.substring(3, 6)+"-"+phone.substring(6, 9);
        person.setPhone(phone);
        
        Address add = person.getAddress();
        aux = add.getName()+"\n"+
                add.getNumber()+" "+add.getStreet()+"\n"+
                add.getCity()+" "+add.getState()+" "+add.getZip();
        person.setAddressStr(aux);
    }

    @Override
    public void formatDate(String date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
