package sages.bootcamp.person;


/**
 * Created by lary8 on 04.07.2017.
 */
public class Emploee {

    int id;
    String position;
    String name;
    int phoneNumber;
    int nip_pesel;

    public Emploee(int id, String position, String name, int phoneNumber, int nip_pesel) {
        this.id = id;
        this.position = position;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.nip_pesel = nip_pesel;
    }


    public String getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getNip_pesel() {
        return nip_pesel;
    }
}
