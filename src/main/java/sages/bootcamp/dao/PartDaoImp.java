package sages.bootcamp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import sages.bootcamp.werchouse.Part;

import java.util.List;

/**
 * Created by lary8 on 04.07.2017.
 */
@Repository
public class PartDaoImp implements PartDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private RowMapper<Part> partRowMapper = ((resultSet, i) -> {
        int id = resultSet.getInt("id");
        String name = resultSet.getString("name");
        int price = resultSet.getInt("price");
        int catalogNumber = resultSet.getInt("catalog_number");
        int available_quantity = resultSet.getInt("available_quantity");
        return new Part(id, name, price, catalogNumber, available_quantity);
    }
    );

    @Override
    public void addPart(String name, int price, int catalogNumber) {
        jdbcTemplate.update("INSERT INTO parts(name, price,catalog_number) VALUES (?,?,?)", name, price, catalogNumber);
    }

    @Override
    public Part findPpartById(int id) {
        return jdbcTemplate.queryForObject("SELECT * FROM parts WHERE id = ?", partRowMapper, id);
    }

    @Override
    public Part findPpartByCatalogNumber(int catalogNumber) {
        return jdbcTemplate.queryForObject("SELECT * FROM parts WHERE catalog_number = ?", partRowMapper, catalogNumber);
    }


    @Override
    public Part findPartByName(String name) {
        return jdbcTemplate.queryForObject("SELECT * FROM parts WHERE name LIKE  ?", partRowMapper, name);
    }

    @Override
    public List<Part> findPartByavailable_quantity() {
        return jdbcTemplate.query("SELECT * FROM parts WHERE available_quantity >0", partRowMapper);
    }

    @Override
    public List<Part> findAll() {

        return jdbcTemplate.query("SELECT * FROM parts", partRowMapper);


    }

    @Override
    public void addPart() {

    }
}
