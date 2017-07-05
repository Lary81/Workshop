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

    private RowMapper<Part> partRowMapper = ((resultSet, i) ->)


    @Override
    public void addPart(String name, int price, int catalogNumber) {
        jdbcTemplate.update("INSERT INTO part(name, price,catalogNumber) VALUES (?,?,?)", name, price, catalogNumber);
    }

    @Override
    public Part findPpartById(int id) {
        return null;
    }

    @Override
    public Part findPpartByCatalogNumber(int catalogNumber) {
        return null;
    }


    @Override
    public Part findPart(String name) {
        return null;
    }

    @Override
    public List<Part> findAll() {

        return jdbcTemplate.query("SELECT * FROM part", (resultSet, i) -> {

                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    int price = resultSet.getInt("price");
                    int catalogNumber = resultSet.getInt("catalogNumber");
                    return new Part(id, name, price, catalogNumber);


                }
        );
    }
}
