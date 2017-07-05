package sages.bootcamp.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import sages.bootcamp.person.Customer;

import java.sql.ResultSet;

/**
 * Created by lary8 on 04.07.2017.
 */
@Repository

public class CustomerDaoImp implements CustomerDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    private RowMapper<Customer> customerRowMapper = ((ResultSet resultSet, int i) -> {
        int id = resultSet.getInt("id");
        String name = resultSet.getString("name");
        int phoneNumber = resultSet.getInt("phoneNumber");
        int nip_pesel = resultSet.getInt("nip_pesel");
        return new Customer(id, name, phoneNumber, nip_pesel);
    }
    );

    @Override
    public void addCustomer(String name, int phoneNumber, int nip_pesel) {
        jdbcTemplate.update("INSERT INTO customer (name, phonenumber,nip_pesel) VALUES (?,?,?)", name, phoneNumber, nip_pesel);
    }

    @Override
    public Customer findCustomerById(int id) {
        return jdbcTemplate.queryForObject("SELECT * FROM customer WHERE id = ?", customerRowMapper, id);
    }

    @Override
    public Customer findCustomerByName(String name) {
        return jdbcTemplate.queryForObject("SELECT * FROM customer WHERE name LIKE ?", customerRowMapper, name);
    }

    @Override
    public Customer findCustomerByNIP_PESEL(int nip_pesel) {
        return jdbcTemplate.queryForObject("SELECT * FROM customer WHERE customer.nip_pesel LIKE ?", customerRowMapper, nip_pesel);
    }

    @Override
    public Customer havePhonenumber(int phoneNumber) {
        return null;
    }

    @Override
    public Customer haveNIP_PESEL(int nip_pesel) {
        return null;
    }
}
