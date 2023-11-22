import javax.annotation.processing.Generated;

public class Client extends User{

private int BalanceId;

private int ID;
private String name;
private String surname;
private int passportID;
private String email;
private  String password;

    public Client(int balanceId, int ID, String name, String surname, int passportID, String email, String password) {
        BalanceId = balanceId;
        this.ID = ID;
        this.name = name;
        this.surname = surname;
        this.passportID = passportID;
        this.email = email;
        this.password = password;
    }
}
