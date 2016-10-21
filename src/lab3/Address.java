package lab3;

class Address {
    private String _name;
    private String _street;
    private String _number;
    private String _apt;
    private String _zip;
    private String _state;
    private String _city;
    
    public Address(String name, String street, String number,
            String apt, String zip, String state, String city){
        _name = name;
        _street = street;
        _number = number;
        _apt = apt;
        _zip = zip;
        _state = state;
        _city = city;
    }
    
    public Address(String name, String street, String number, 
            String zip, String state, String city){
        _name = name;
        _street = street;
        _number = number;
        _zip = zip;
        _state = state;
        _city = city;
    }
    
    public String getName(){
        return _name;
    }
    public void setName(String name){
        _name = name;
    }
    
    public String getStreet(){
        return _street;
    }
    public void setStreet(String street){
        _street = street;
    }
    
    public String getNumber(){
        return _number;
    }
    public void setNumber(String number){
        _number = number;
    }
    
    public String getApt(){
        return _apt;
    }
    public void setApt(String apt){
        _apt = apt;
    }
    
    public String getZip(){
        return _zip;
    }
    public void setZip(String zip){
        _zip = zip;
    }
    
    public String getState(){
        return _state;
    }
    public void setState(String state){
        _state = state;
    }
    
    public String getCity(){
        return _city;
    }
    public void setCity(String city) {
        _city = city;
    }
}
