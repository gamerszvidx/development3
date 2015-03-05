/**
 * Created by ricardo on 2/26/2015.
 */

public class Person {
    String name, adress, phonenumber, city;

    public Person(String name, String adress, String phonenumber, String city) {
        this.name = name;
        this.adress = adress;
        this.city = city;
        this.phonenumber = phonenumber;
    }

    public String getCity() { 
        return city; 
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

}


