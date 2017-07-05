package sages.bootcamp.person;

/**
 * Created by lary8 on 04.07.2017.
 */

public class Customer {
    public Customer(int id, String name, int phoneNumber, int nip_pesel) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.nip_pesel = nip_pesel;
    }

    int id;
    String name;
    int phoneNumber;
    int nip_pesel;

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
