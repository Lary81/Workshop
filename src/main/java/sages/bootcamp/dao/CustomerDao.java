package sages.bootcamp.dao;

import sages.bootcamp.person.Customer;

/**
 * Created by lary8 on 04.07.2017.
 */
public interface CustomerDao {
    void addCustomer(String name, int phoneNumber, int nip_pesel);

    Customer findCustomerById(int id);

    Customer findCustomerByName(String name);

    Customer findCustomerByNIP_PESEL(int nip_pesel);

    Customer havePhonenumber(int phoneNumber);

    Customer haveNIP_PESEL(int nip_pesel);
}
