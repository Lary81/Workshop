package sages.bootcamp.dao;

import sages.bootcamp.person.Emploee;

/**
 * Created by lary8 on 04.07.2017.
 */
public interface EmploeeDao {
    void addEmploee(String name, String position, int phoneNumber, int nip_pesel);

    Emploee findEmploeeById(int id);

    Emploee findEmploeeByName(String name);

    Emploee findEmploeeByPosition(String position);

    Emploee findEmploeeByNIP_PESEL(int nip_pesel);

    Emploee havePhonenumber(int phoneNumber);

    Emploee haveNIP_PESEL(int nip_pesel);

}
