package swingcrud;

/**
 *
 * @author JAMES
 */
public class User {
    String number,brand,sponsor,driver;
    public User(String number,String brand,String sponsor,String driver){
        this.number = number;
        this.driver = driver;
        this.sponsor = sponsor;
        this.brand = brand;
    }
    
    //getters
    public String getNumber(){
        return this.number;
    }
    public String getBrand(){
        return this.driver;
    }
    public String getSponsor(){
        return this.sponsor;
    }
    public String getDriver(){
    return this.driver;
    }
    
}
