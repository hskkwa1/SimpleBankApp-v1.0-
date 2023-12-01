import javax.annotation.processing.Generated;
import javax.xml.crypto.Data;

public class Client extends User{

private int BalanceId;

private int ID;
private String name;
private String surname;
private int passportID;
private String email;
private  String password;
private Data dateOfBirth;
private String address;

    public Client(int balanceId, int ID, String name, String surname, int passportID, String email, String password) {
        this.BalanceId = balanceId;
        this.ID = ID;
        this.name = name;
        this.surname = surname;
        this.passportID = passportID;
        this.email = email;
        this.password = password;
    }
}
