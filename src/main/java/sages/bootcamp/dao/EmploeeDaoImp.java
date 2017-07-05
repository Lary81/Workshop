package sages.bootcamp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import sages.bootcamp.person.Emploee;

import java.sql.ResultSet;

/**
 * Created by lary8 on 04.07.2017.
 */
@Repository

public class EmploeeDaoImp implements EmploeeDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    private RowMapper<Emploee> emploeeRowMapper = ((ResultSet resultSet, int i) -> {
        int id = resultSet.getInt("id");
        String name = resultSet.getString("name");
        String position = resultSet.getString("position");
        int phoneNumber = resultSet.getInt("phoneNumber");
        int nip_pesel = resultSet.getInt("nip_pesel");
        return new Emploee(id, name, position, phoneNumber, nip_pesel);
    }
    );

    @Override
    public void addEmploee(String name, String position, int phoneNumber, int nip_pesel) {
        jdbcTemplate.update("INSERT INTO emploee (name, positionworker,phonenumber,nip_pesel) VALUES (?,?,?,?)", name, position, phoneNumber, nip_pesel);
    }

    @Override
    public Emploee findEmploeeById(int id) {
        return jdbcTemplate.queryForObject("SELECT * FROM emploee WHERE id = ?", emploeeRowMapper, id);

    }

    @Override
    public Emploee findEmploeeByName(String name) {
        return jdbcTemplate.queryForObject("SELECT * FROM emploee WHERE name LIKE ?", emploeeRowMapper, name);
    }

    @Override
    public Emploee findEmploeeByPosition(String position) {
        return jdbcTemplate.queryForObject("SELECT * FROM emploee WHERE positionworker LIKE ?", emploeeRowMapper, position);

    }

    @Override
    public Emploee findEmploeeByNIP_PESEL(int nip_pesel) {
        return jdbcTemplate.queryForObject("SELECT * FROM emploee WHERE nip_pesel = ?", emploeeRowMapper, nip_pesel);

    }

    @Override
    public Emploee havePhonenumber(int phoneNumber) {
        return jdbcTemplate.queryForObject("SELECT phonenumber FROM emploee WHERE phonenumber !=(0,NULL)", emploeeRowMapper, phoneNumber);

    }

    @Override
    public Emploee haveNIP_PESEL(int nip_pesel) {
        return jdbcTemplate.queryForObject("SELECT nip_pesel FROM emploee WHERE nip_pesel != (0,NULL )", emploeeRowMapper, nip_pesel);

    }
}
