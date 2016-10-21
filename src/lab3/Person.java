package lab3;

public class Person {
    
    private String _name;
    private String _phone;
    private String _email;
    private Address _address;
    private String _addressStr;
    
    public String getName(){
        return _name;
    }
    public String getPhone(){
        return _phone;
    }
    public String getEmail(){
        return _email;
    }
    public Address getAddress(){
        return _address;
    }
    public String getAddressStr(){
        return _addressStr;
    }
    
    
    public void setName(String name){
        _name = name;
    }
    public void setPhone(String phone){
        _phone = phone;
    }
    public void setEmail(String email){
        _email = email;
    }
    public void setAddress(Address address){
        _address = address;
    }
    public void setAddressStr(String address){
        _addressStr = address;
    }
}
